package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is the Command : ");
        Command command = new Command();
        while (true) {
            String commandStr = reader.readLine().trim().toLowerCase();
            command.getCommand(commandStr);
            System.out.println();
        }
    }
}
