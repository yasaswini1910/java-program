class One {
  void display() {
    System.out.println("This is from class one");
  }
}

// Single inheritance
class Two extends One {
  // polymorphism
  @Override
  void display() {
    super.display();
    System.out.println("This is from class Two");
  }
}

// hierarical inheritance
class Three extends Two {
  void display(int x) {
    super.display();
    System.out.println();
    int y = 10;
    int z = x + y;
    System.out.println("Sum of " + x + " and " + y + " is " + z);
  }
}

// hierarical inheritance
class Four extends Two {
  // void display
  @Override
  void display() {
    System.out.println("this is hierarical inheritence");
  }
}

public class Inherit {
  public static void main(String[] args) {
    Three t = new Three();
    t.display(10);
    Four f = new Four();
    f.display();
  }
}