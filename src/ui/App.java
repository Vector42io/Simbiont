package ui;

import java.util.Scanner;

public class App  implements Startable{
/*
    нужен интерфейс для взаимодействия с движком

    модель StoryTree

    работа с классом StoryTeller
    методы getNext вернет следующую историю
    метод getVariants вернет  Модель Variants который содержит варианты left и right
    метод getRight вернет ветку с права
    метод getLeft вернет ветку слева

 */

    @Override
    public void start() {
        startConsole();
    }

    public void startConsole(){
        Scanner scanner = new Scanner(System.in);
        String line;
        while (true){
             line = scanner.nextLine();
             switch (line){
                 // TODO
                 case "":

             }
        }
    }

    public static App getInstance() {
        return new App();
    }
}

