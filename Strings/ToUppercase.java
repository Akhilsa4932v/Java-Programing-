package Strings;

public class ToUppercase {
    
        //By using only string.  ------->convert all letters to capital

        // public static void Uppercase(String name){
        //     String UpName = ""  ;
        //     for(int i=0;i<name.length();i++){
        //         if(name.charAt(i) ==' '){
        //             UpName += (char)(name.charAt(i));
        //         }
        //         UpName += (char)(name.charAt(i)-32);
        //     }
        //     System.out.println(UpName);
        // }
    
        //------------------>> only first lettter capital
        //By using String Builder
        public static String To_Uppercase(String name){
    
            StringBuilder sb = new StringBuilder("");
    
            char ch = Character.toUpperCase(name.charAt(0));
            sb.append(ch);
    
            for(int i=1;i<name.length();i++){
    
                if(name.charAt(i) == ' ' && i<name.length()-1){
                    sb.append(name.charAt(i));
                    i++;
                    sb.append(Character.toUpperCase(name.charAt(i)));
                }
                else{
                    sb.append(name.charAt(i));
                }
                
            }
            return sb.toString();
    
        }
        public static void main(String[] args) {
            System.out.println(To_Uppercase("nani is my inspiration"));
        }
    }
    
    
    
    
    

