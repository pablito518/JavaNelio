package exercicio1.entities;

import java.text.MessageFormat;

public class Rectangle {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return width * 2 + height * 2;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height,2));
    }

    @Override
    public String toString(){
        return MessageFormat.format("AREA = {0,number,#.##}\nPERIMETER = {1,number,#.##}\nDIAGONAL = {2,number,#.##}", area(), perimeter(), diagonal());
    }
}
