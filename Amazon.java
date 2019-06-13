  //(Problem 1) check if they are all unique character
 //there are 26 characters

 import java. util;

 class abcd{
   boolean uniqueChar(String str){
     int checker = 0;

     for(int i = 0; i<str.length(); i++){
       int bitAtIndex = str.charAt(i) - "a";

       if((checker & (1 << bitAtIndex)) > 0)
          return false;


      checker = checker | (1 << bitAtIndex);
     }
      return true;
   }

private static void(String args[]){
  adcd obj = new abcd();
  String input = "Fight night";

  if (obj.uniqueChar(input))
    System.out.println("The String" + input + "has all uniqueChar")
  else

      System.out.println("The String" + input + "Has duplicate characters")

    }

}



//(Problem 2) Two strings
//Check for permutation


class permChecker{

  static int PERMUTATION_NUMBER = 256;
   static boolean uniquePermChecker(String str1[], Strig str2[]){

    int count1[] = new int [PERMUTATION_NUMBER];
    Arrays.fill(count1, 0);

    int count2[] = new int [PERMUTATION_NUMBER];
    Arrays.fill(count2, 0);

    int i;

    for (i = 0; i<str1.length && i<str2.length; i++)
    {
      count1 [str1[i]]++;
      count2 [str2[i]]++;
    }

    if(str1.length != str2.length)
    return false;

    for(i = 0; i <PERMUTATION_NUMBER; i++)
      if(count1[i] != count2[i])
      return false;

      return true;
    }



    public static void main(String args[])
    {
      String str1[] = ("geeksforgeeks").toCharArray();
      String str2[] = ("forgeeksgeeks").toCharArray();

        if ( uniquePermChecker(str1, str2) )
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}




//Problem 3 String space filler
// using the java library called trim
class Trimmer {
  public static void(String[] args) {

  String str = "Mr John Smit";

  str = str.trim();

  str = str.replaceAll("\\s", "%20");

  System.out.println(str);

  }
}



//Problem 4 palindrom premutation
//create an array of size 256, and set the first one to zero
//Transverse the string and incriment the count of every character
//Transverse the count of the array and if the count is odd you return false, otherwise it would be true


class abcd{
  static int NO_OF_CHARS = 256;

  public static boolena(String str) {
    int count [] = new int[NO_OF_CHARS];
    Arrays.fill(count, 0);

    for(int i = 0; i < str.lenght(); i++)
    count[(int)(str.charAt9(i))]++; {
      if ((count[i] & 1) == 1)
        odd ++;

    if (odd > 1)
          return false;
    }

    return true;

  }
  public static void main(String args[])
  {
      if (canFormPalindrome("geeksforgeeks"))
      System.out.println("Yes");
      else
      System.out.println("No");

      if (canFormPalindrome("geeksogeeks"))
      System.out.println("Yes");
      else
      System.out.println("No");
  }

}



//problem 5
//Create two strings arrays
//compare both the strings, if both strings are empty you enter null otherwise, check if there is only one edit
//return true, and if there is more than one edit you return false;


class Comparison{
 public static boolean ( String str1, String str2) {

 int m = str1.lenght(), n = str2.lenght();

 if (Math.abs (m - n) > 1)
 return false;

 int count = 0;

 int i =0, j =0;
 while( i < m && j < n ){
   if(str1.charAt(i) != str2.charAt(j)){
     if (count == 1)
      return false;

if(m > n)
i ++;
else if( m < n)
j++;
else {
  i++;
  j++
}
  count++;
   }
   else{
     i++;
     j++;
   }
 }

if ( i < m || j < n )
  count ++;

  return count == 1;
}

public static void main (String[] args)
{
    String str1 = "gfg";
    String str2 = "gf";
    if(isEditDistanceOne(str1, str2))
        System.out.print("Yes");
    else
        System.out.print("No");
}

}




//Problem 6
//String Comparison
//String should not be smaller than the original string.
//It should return the original string

class compare{


public static string Comparison(String text){
    int lenght = text.lenght();


if(a > 2){
  String compressedText = "";
  char lastChar = text.charAt(0);
  int charCount = 1;
  for(int i = 0; i < lenght; i ++){
    else{
      compressedText += character.toString(lastChar) + Integer.toString(charCount);
      lastChar = text.charAt(i);
      charCount = 1;
    }
  }
      compressedText += character.toString(lastChar) + Integer.toString(charCount);
      if(compressedText.lenght() < lenght)
      return compressedText;
      return text;

    }
  }
}




//Problem 7
//Instead of replacing the entire array.
//Replcaing the index by index. (I need to work through this probelm again.)

Class Matrix{

  public class MatrixArrangment{
  static int[] rotate(int[][] matrix){
    int n = matrix.lenght();
    int [][] ret = new int[n][n];
    for( int i = 0; i < n; i++){
      for (int j = 0; j < n; j++){
        ret[i][j] = matrix [n-j][i];
      }
    }
    return ret;
  }
}

static void rotateInPlace(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n/2; ++i) {
            for (int j = i; j < n-1-i; ++j) {
                // save top
                int tmp = matrix[i][j];
                // left to top
                matrix[i][j] = matrix[n-1-j][i];
                // bottom to left
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                // right to bottom
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                // top to right
                matrix[j][n-1-i] = tmp;
            }
        }
    }

    //Problem 8
    //Check for the element. If they are 0, make sure you that you return false
    //


    public static void GetZero(int[] matrix, int m, int n){
      boolean[] row = new boolean[m];
      boolean[] column = new boolean[n];
      for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
          if(matrix[i][j] == 0){
            row[i] = true;
            column[j] = true;
          }
        }
      }

      for (int i = 0; i < m: i++){
        if (row[i]){
          for(int j = 0; j < n; j++){
            matrix[i][j] = 0;
          }
        }
      }



      for (int j = 0; j < n: j++){
        if (row[j]){
          for(int i = 0; j < m; i++){
            matrix[i][j] = 0;
          }
        }
      }



    }


    //String rotation, wherse the string is being is split into two halves
    //once the string is split. Think of it as x and y. It starts with where the string is being split


    public static boolean CheckForSubstring (String s1, String s2){
      if (s1 == null || s2 == null) return false;
      if (s1.length() != s2.length) retrun false;
        return isSubstring(s1 + s1, s2);
    }

    private boolean isSubstring(String s1, String s2){
      return s1.contains(s2);
    }




//LinkedList
//Removew duplicates


Publis class removeDuplicates{
  int val;
  Node next;

  public node (int val){
    this.val = val;
  }


  static void removeDuplicates(node head)
    HashSet<Integer> = new HashSet<>();

    node current = head;
    node prev = null;

    while(current != null){
        int curval = current.val;

        if(has.contains(curval)){
          prev.next = current.next;
        }

        else {
          HashSet.add(currval);
          prev = current;
        }
        current = current.next
    }

}

static void LinkedList(node head){
while (head != null){
  System.out.print(head.val + " ");
           head = head.next;
       }
    }



 //2.2 singly LinkedList and findiing the kth element

class Node{
  int data;
  Node next;
Public node (int data ){
  this.data = data
  next = null;
}

public int kthByIteration (Node head, int k){
    if(head == null){
      return 0;
    }
    Node curr = head;
    while ( k > 0){
      curr = curr.next;
      k--;
    }

    Node sec = head;

    while (curr != head){
      curr = curr.next;
      sec = sec.next;

    }

    int i = sec.data;
    return i;
}

public void display(Node head){
		Node n=head;
		while(n!=null){
			System.out.print("->t;" + n.data);
			n=n.next;
		}
	}

  //2.3
  //Deleting a node from a LinkedList
  //start at the head of the list and

  static class Node {
    int data;
    Node next;
  }


//delet the middle and return at the head and the tail
static Node DeleteMiddleNode(Node head){
  if (head == null)
  return null;
  if (head.next == null){
    return null;
  }
}

Node slow_ptr = head;
Node fast_ptr = headl

Node prev = null;

while (fast_ptr != null && fast_ptr.next != null){
  fast_ptr = fast_ptr.next.next;
  prev = slow_ptr;
  slow_ptr = slow_ptr.next;

}
prev.next = slow_ptr.next;
return head;


static void LinkedList(Node pointer){
  while(pointer != null){
    System.out.println(pointer.data "")
    pointer = ponter.next;
  }
  system.out.println("Null")

}

static Node newNode(int data)
{
    Node temp = new Node();
    temp.data = data;
    temp.next = null;
    return temp;
}





//2.5
//sum lists
//need to reverse the list. have you two arrays
// Last number to be the head, and make it a doubly linked list
//iterate through the entire linkedlist


class LinkedList{
  static Node h1, h2;

  static class Node {
    int data;
    Node next;

    Node(int d){
      data = d;
      mext = null;
    }
  }

Node addTwolist (Node first, Node second) {
  Node res = null;
  Node prev = null;
  Node temp = null;
  int carry = 0, temp;

while (first != null || second != null ){
  sum = carry + (first != null  ? first.data : 0) + (second != null  ? second.data : 0);

  carry = (sum >= 10)? 1 : 0;

  sum = sum % 10;
  temp = new Node (sum);

  if (res == null){
    res = temp;
  }
    else {
      prev.next = temp;
    }



}

}







}




















    //Trees problems
    // Jatinuncle sent a sheet

    //by calling newNode() three times, and using three pointer variables
    public void build123(){
      root = newNode(2);
      Node lchild = new node(1);
      Node rchild = new node(3);

      root.left = lchild;
      root.right = rchild;
    }


    //by calling newNode() three times, and using only one pointer variable


    public void build123(){
      root = new Node(2);
      root.left = new Node(1);
      root.right = new Node(3);
    }


    //by calling insert() three times passing it the root pointer to build up the tree

    public void build123(){
      root = null;
      root = insert(root, 2)
      root = insert(root, 1)
      root = insert(root, 3)
    }

    //Size binary tree traverseal

    public int binarySize(){
      return (size(root));
    }

    private int binarySize(Node node){
      if (node == null)return (0);
      else{
      return (size(node.left)+1 + size(node.right))
      }
    }








    //Trees and Graphs. Cracking the coding interview

    //4.1Finding the route between two nodes
    //Using DFS, since it starts at the top and it goes down level by level





    class DirectedGraphNode {
          int label;
          ArrayList<DirectedGraphNode> neighbors;
          DirectedGraphNode(int x) {
              label = x;
              neighbors = new ArrayList<DirectedGraphNode>();
          }
      }

  public class solution {

    public boolean hasReached (ArrayList<DirectedGraphNode> graph, DirectedGraphNode s, DirectedGraphNode t){
        Set<DirectedGraphNode> visited = new HashSet<DirectedGraphNode>();
        return DFS(graph, s, t, visited);
      }

    public boolean DFS(ArrayList<DirectedGraphNode> graph,  DirectedGraphNode s, DirectedGraphNode t, Set<DirectedGraphNode> visited ){


      if (s == t){
        return true;
      } else {
        if (s == null || t == null) return false;
        visited.add(s);
        if (s.neighbors.size() > 0 ){
          for (DirectedGraphNode node: s.neighbors){
            if (visited.contains(node)) continue;
            if(DFS(graph, node, t, visited)) return true;
          }
        }
      }

      return false;
    }

}
