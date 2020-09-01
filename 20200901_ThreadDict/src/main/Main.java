/**
 * 이전에 만든 영어단어와 한글 뜻을 입력하고 파일로 저장한 프로젝트를 가져와
 * 문제풀기 시작할 때 쓰레드를 시작, 
 * 한글 뜻을 보여주면 영어단어를 입력하여 모든 문제를 풀고
 * 문제가 끝날때 평균 시간을 보여준다
 */
package main;

 public class Main {
     public static void main (String[] args) {
        new Quiz().run();
     }
 }
 