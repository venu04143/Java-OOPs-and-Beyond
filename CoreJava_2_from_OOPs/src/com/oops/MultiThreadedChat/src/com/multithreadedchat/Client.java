package com.multithreadedchat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	private Socket socket;
	private BufferedReader  bufferedReader;
	private BufferedWriter bufferedWriter;
	private String userName;
	
	public Client(Socket socket,String userName) {
		try {
    		this.socket = socket;
    		this.bufferedWriter=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
    		this.bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
    		this.userName=userName;
		}catch(IOException e) {
			closeEverything(socket,bufferedReader,bufferedWriter);
		}
	}
	public void sendMessage() {
		try {
			bufferedWriter.write(userName);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			
			Scanner sc = new Scanner(System.in);
			while(socket.isConnected()) {
				String messageTosend = sc.nextLine();
				bufferedWriter.write(userName + " : "+ messageTosend);
				bufferedWriter.newLine();
				bufferedWriter.flush();
			}
		}catch(IOException e ) {
			closeEverything(socket,bufferedReader,bufferedWriter);
		}
	}
	
	public void listenForMessage() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				String msgFromGroupChat;
				
				while(socket.isConnected()) {
					try {
						msgFromGroupChat = bufferedReader.readLine();
						System.out.println(msgFromGroupChat);
					}catch(IOException e) {
						closeEverything(socket,bufferedReader,bufferedWriter);
					}
				}
				
			}
			
		}).start();
	}
	
	public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
		try {
			if(bufferedReader!=null) {
				bufferedReader.close();
			}
			if(bufferedWriter !=null) {
				bufferedWriter.close();
			}
			if(socket!=null) {
				socket.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username for group chat : ");
		String username= sc.nextLine();
		
		
			Socket socket = new Socket("localhost",8080);
			Client client = new Client(socket,username);
			client.listenForMessage();
			client.sendMessage();
		
		
	}

}
