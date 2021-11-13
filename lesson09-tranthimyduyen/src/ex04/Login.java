package ex04;

import java.util.Scanner;

public class Login {
	public int CheckAccount(String userName, String passWord) {
        if (passWord.length() < 8) {
            return 0;
        }
        int countNumber = 0;
        int countUppercase = 0;
        int countSpecicalChar=0;
        for (int i = 0; i < passWord.length(); i++) {
            if ((int) passWord.charAt(i) <= 57 && (int) passWord.charAt(i) > 47) {
                countNumber++;
            }
            if ((int) passWord.charAt(i) < 91 && (int) passWord.charAt(i) > 64) {
                countUppercase++;
            }
            if (passWord.charAt(i)=='~'||passWord.charAt(i)=='!'||passWord.charAt(i)=='$'||passWord.charAt(i)=='%'||passWord.charAt(i)=='^'||passWord.charAt(i)=='&'||passWord.charAt(i)=='*') {
                countSpecicalChar++;
            }
            if(i+3<passWord.length()){
                String s=passWord.substring(i, i+3);
                if(userName.contains(s)){
                    return 0;
                }
            }
        }
        System.out.println(countNumber+" "+countSpecicalChar+" "+countUppercase);
        if(countNumber>0&&countUppercase==1&&countSpecicalChar==1)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName;
        String passWord;
        Login b4=new Login();
        while (true) {
            System.out.println("Nhap vao tai khoan:");
            userName = sc.nextLine();
            System.out.println("Nhap vao mat khau:");
            passWord = sc.nextLine();
            if(b4.CheckAccount(userName,passWord)==1){
                System.out.println("Đăng ký thành công !");
                return;
            }else{
                System.out.println("Vui long nhap lai");
            }
        }
    }
}
