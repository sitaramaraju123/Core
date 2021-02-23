public class Vowels{

public static void main(String[] args){

char ch[]={'a','a','e','e','i','i','o','a','u'};

char ch1[]={'a','e','i','o','u'};


for(int i=0;i<ch1.length;i++){

int count=0;

for(int j=0;j<ch.length;j++){

if(ch1[i]==ch[j]){

count++;

}

}

System.out.println(ch1[i]+ " " +count);

}

}

}

