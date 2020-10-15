# FileI/O

## 파일로 저장
```java
public void createFilesFileWriter() {
    File tempFile = new File(dir + "tmp.txt", true);       
    
    if(tempFile.exists()== true) {			        //파일 존재 여부 확인
    }


    FileWriter fw;
    try {
        fw = new FileWriter(txt, false);            //덮어쓰기 , true 붙여쓰기
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
```

## 파일 부르기
```java
public void readLineByLine() {
    try {
        // 한 줄씩 읽기
        BufferedReader br = new BufferedReader(new FileReader(txt));
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
```

--- 
#### 다른 방법 파일 저장
```java
/** FileOutputStream을 사용한 저장방법 **/
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
```

#### 다른 방법 파일 부르기
```java
/** 바이트로 읽는 읽기 방법 **/
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
```