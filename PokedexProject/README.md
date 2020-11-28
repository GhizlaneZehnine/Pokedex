After cloning this repository, if you have a Java environment on your machine, you can directly run the commands.


# Build the project

```
./gradlew build
```



# Run the application
To use the pokemonAPI :
```
./gradlew run --args="id"
```
for example : 
```
./gradlew run --args="1"
```

To use the local database :

```
./gradlew run --args="id url"
```
For example :

```
./gradlew run --args="1 C:\Users\HP\Desktop\pokemondatabase.sqlite"
```


# Run the tests

```
./gradlew test
```
