package com.company;
import java.util.*;

public class Command {
    private HashMap<String, ColorGame> SubscribedItems;

    public Command(){
        SubscribedItems = new HashMap<>();
    }

    private ColorGame MatchingItems(String object){
        switch(object){
            case "salt":return new Salt();
            case "ink":return new Ink();
            case "blood":return new Blood();
            case "apple" : return new Apple();
            case "frog":return new Frog();
            case "banana":return new Banana();
            case "sky":return new Sky();
            default: return null;
        }
    }
    void getCommand(String command) {

        switch(RunCommand(command)) {
            case "list": printAllSubscribedItems();
                break;
            case "subscribe":

                if(Subscribe(command.substring(1))) {
                    System.out.println("Subscribed "+command.substring(1));
                }
                break;
            case "unsubscribe":
                if(UnSubscribe(command.substring(1))) {
                    System.out.println("unSubscribed "+command.substring(1));
                }
                break;
            case "exit":

                System.exit(0);
            default:
                colorMatch(command);
                break;
        }

    }

    private String RunCommand(String command) {
        if(command.startsWith("+")) {
            return "subscribe";
        }
        else if(command.startsWith("-")) {
            return "unsubscribe";
        }
        else {
            return command;
        }
    }

    private boolean Subscribe(String object){
        ColorGame obj = MatchingItems(object);
        if (obj==null) return false;
        SubscribedItems.put(object, obj);
        return true;
    }

    private boolean UnSubscribe(String object){
        if (SubscribedItems.containsKey(object)){
            SubscribedItems.remove(object);
            return true;
        }
        return false;
    }

    private void colorMatch(String color) {

        SubscribedItems.forEach((key, value) -> {
                    if(value.colors.containsKey(color)) {
                        System.out.println(value.print(color));
                    }
                }
        );

    }

    private void printAllSubscribedItems() {
        SubscribedItems.forEach((key, value) -> {
                    System.out.println(key+",");
                }
        );
        System.out.println();
    }

}
