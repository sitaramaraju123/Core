public class Examplespecial{

public static void main(String[] args){

char ch[]={'a','b','*','&','^'};

for(int i=0;i<ch.length;i++){

if(ch[i]>=33 && ch[i]<=47 || ch[i]>=58 && ch[i]<=64 || ch[i]>=91 && ch[i]<=96 || ch[i]>=123 && ch[i]<=126)
{

System.out.println(ch[i]+ " :is a special characters");

}

}


}

}