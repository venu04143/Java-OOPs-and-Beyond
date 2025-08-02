package com.multithreadedchat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private ServerSocket serverSocket;
	
	 public Server(ServerSocket serverSocket) {
		 this.serverSocket=serverSocket;
	 }
	 
	 public void startServer() {
		 try {
			 while(!serverSocket.isClosed()) {
				 Socket socket =serverSocket.accept();
				 System.out.println("A new Client has Connected !");
				 ClientHandler clientHandler = new ClientHandler(socket);
				 
				 Thread thread = new Thread(clientHandler);
				 thread.start();
			 }
		 }catch(IOException e) {
			 System.out.println("Server Error: " + e.getMessage());
		 }
	 }
	 
	 public void closeServerSocket() {
		 try {
			 if(serverSocket != null) {
				 serverSocket.close();
			 }
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public static void main(String[] args) {
		
		 try {
	            ServerSocket serverSocket = new ServerSocket(8080);
	            Server server = new Server(serverSocket);
	            server.startServer();
	        } catch (Exception e) {
	            System.out.println("Failed to start server: " + e.getMessage());
	        }
	}

}
