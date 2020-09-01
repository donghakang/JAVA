package FileStream;

import java.io.*;

public class FileTest {

    String dir = "/Users/donghakang/Documents/JAVA/tmp/";

    public void createFilesFileOutputStream() {
        FileOutputStream output = null;
        String data;

        try {
			output = new FileOutputStream(dir + "tmp.txt");

			data = "가나다라\r\n";
			output.write(data.getBytes()); // 파일에 저장

			data = "마바사아\r\n";
			output.write(data.getBytes()); // 파일에 저장

			data = "자카타파\r\n";
			output.write(data.getBytes()); // 파일에 저장
			output.close();
			System.out.println("정상종료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }


    public void createFilesFileWriter() {
        /** FileOutputStream 과 동일하게, 덮어쓰는 방법**/
        File tempFile = new File(dir + "tmp.txt");
        if(tempFile.exists()== true) {			//파일 존재 여부 확인
        }
        FileWriter fw;
        try {
            fw = new FileWriter(dir + "tmp.txt", false); //덮어쓰기 , true 붙여쓰기
            String data = "가나다라\r\n";
            fw.write(data);

            data = "마바사아\r\n";
            fw.write(data);

            fw.close();
            System.out.println("정상종료");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



         /** 붙여쓰기 하는 방법 **/
         FileWriter fw2;
         try {
             fw2 = new FileWriter(dir + "tmp.txt", true);
             String data = "가나다라\r\n";
             fw2.write(data);

             data = "마바사아\r\n";
             fw2.write(data);

             data = "자카타파하\r\n";
             fw2.write(data);

             fw2.close();
             System.out.println("정상종료");
         } catch (FileNotFoundException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }


    }


    public void readFilesByte() {
        byte[] b = new byte[1024];
        FileInputStream input;
        try {
            input = new FileInputStream(dir + "tmp.txt");
            input.read(b);
            String str = new String(b);
            System.out.println(str);
            input.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void readLineByLine() {
		try {
			// 한 줄씩 읽기
			BufferedReader br = new BufferedReader(new FileReader(dir + "tmp.txt"));
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				System.out.println(line);
			}
			br.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
}