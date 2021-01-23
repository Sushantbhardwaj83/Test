
public class BigInString {

static String s="123687";
static char[] ch=s.toCharArray();
static int largest() 
{  int i; 
      
    int big = ch[0]; 
   
    // Traverse array elements from second and 
    // compare every element with current max   
    for (i = 1; i < ch.length; i++) 
        if (ch[i] > big) 
            big = ch[i]; 
   
    return big; 
} 
public static void main(String[] args) {
	largest();
}
}

