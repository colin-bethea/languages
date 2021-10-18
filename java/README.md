# Java

Java is a super popular object-oriented language; used by many companies and universities across the globe.

## Installation

Install via [Homebrew](https://devqa.io/brew-install-java/) or another preferred method.

## Usage

### Write your code

```java
import java.security.*;

public class Demo {

  public static void main(String[] args) {
    try {
      System.out.println(
        Request.get("https://jsonplaceholder.typicode.com/posts")
      );
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }
}

```

### Compile your code

```bash
javac MyClass.java
```

### Run your code

```java
java MyClass
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Typically this might come about when a language is updated/major changes occur and the guides need to be updated.

## License

[MIT](https://choosealicense.com/licenses/mit/)
