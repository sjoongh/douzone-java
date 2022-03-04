package day26_jdbc_gui.quiz.ex2;

class MySum /* 1번 */extends Object{
 int first;
 int second;
 
 MySum(int first, int second){
  this.first = first;
  this.second = second;
 }
 
 public String toString(){
  /* 2번 */
  return String.valueOf(first+second);
 }
 
 
 public boolean equals(Object obj){
	 /* 3번 */
  if(obj instanceof MySum){
	  if (obj.toString().equalsIgnoreCase(this.toString())) return true;
	  else return false;
  }
  else return false;
 }
 
}