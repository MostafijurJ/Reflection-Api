# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

### 1. Getting declared and non-declared element of a class
3 ways to get any element of a class
### Info Class
```java  
@Data
public class Info {
    private String name;
    private String email;
    private String phone;
    public String publicField;
}
````

### Main Class
```java  
Class<?> clazz = Info.class;
````
`Step 1:` It will get all the fields  of **info** class which can be  **public or private**.
```java
 Field[] fields =  clazz.getDeclaredFields();
```
`Step 2:` It will get all the fields  of **info** class which are **public** field. by using this, it returned all the public fields only of **info** class.
````java
 Field[] publicFields =  clazz.getFields();
````
`Step 3:` It will return only the **public** filed of **info** class.

```java
 Field field = clazz.getDeclaredField("publicField");
````