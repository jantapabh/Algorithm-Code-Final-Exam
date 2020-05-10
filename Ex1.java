
public class Ex1{
    public static void main(String args[]){
        
        // Initialising String 
        String Str = new String("we are happy"); 
          
        // original string  
        System.out.print("Original String : " ); 
        System.out.println(Str); 
          
        // Using replaceFirst to replace regex with replace_str 
        // Replaces 1st occurrence of are happy with %20are%20happy
        System.out.print("After replacing  : " ); 
        String Str2 = Str.replaceFirst(" ", "%20"); 
        System.out.println(Str2.replaceFirst(" ", "%20"));

    }

 }