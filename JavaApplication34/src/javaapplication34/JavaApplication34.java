/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;
import java.util.Scanner;
/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sysUserName = "Hekimcan";
        String sysPassword = "hekimcan190547";
        int girisHakki =3;
        String userName,password;
        while(true){
            if(girisHakki==0){
                System.out.println("Giriş hakkınız kalmadı");
                break;
            }
            System.out.println("Kullanıcı adınızı giriniz: ");
          userName = scanner.nextLine();
            System.out.println("Şifrenizi giriniz");
          password=scanner.nextLine();
         
         if(userName.equals(sysUserName) && password.equals(sysPassword)  )
         {
             System.out.println("Sisteme başarı ile giriş yapıldı !!");
              girisHakki--;
              break;
         }
         
         else 
                System.out.println("Hatalı kullanıcı adı veya şifre girişi yaptınız !!");
          girisHakki--;
         
         
        }
        
        
        

    }
    
}
