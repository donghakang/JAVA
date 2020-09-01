package main;

import FileStream.FileTest;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileTest ft = new FileTest();

//        ft.createFilesFileOutputStream();


        /**
        ft.createFilesFileOutputStream();           // 잘 안씀
        ft.readFilesByte();                         // 잘 안씀
        **/

        ft.createFilesFileWriter();
        ft.readLineByLine();

    }
}
