public class ArgsLastPrinter {
  public static void main(String[] args){
    int x = args.length;
    if (x < 1) {
      System.out.println("なし");
    } else {
      System.out.println(args[x - 1]);
    } 
  }
}

