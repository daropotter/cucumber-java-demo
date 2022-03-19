[![MIT License](https://img.shields.io/apm/l/atomic-design-ui.svg?)](https://choosealicense.com/licenses/mit/)

# Gherkin in Java demo

This is a demo of Gherkin in Java using the Cucumber library. The example app is a simple
Java application using Gradle built tool. The demo shows how you can use Cucumber
to test your Java code instead of writing traditional unit tests.

## Setup

The demo project is already set up.
If you don't want to set up your own project, skip this chapter directly to execution.

| ⚠ WARNING: The setup varies between different versions of Java and Gradle.<br/>Please consult the official Cucumber documentation beforehand. |
|-----------------------------------------------------------------------------------------------------------------------------------------------|

The setup can be tricky, so follow along and get help from the documentation if needed.

Firstly, add the Cucumber dependencies to the `dependencies` section in the `build.gradle` file, for example:

```
testImplementation 'io.cucumber:cucumber-java:7.2.3'
testImplementation 'io.cucumber:cucumber-junit:7.2.3'
```

Add Cucumber runtime configuration in the `configurations` section.

```
cucumberRuntime {
    extendsFrom testImplementation
}
```

Finally, add the cucumber task at the end of the file.

```
task cucumber() {
    dependsOn assemble, testClasses
    doLast {
        javaexec {
            main = "io.cucumber.core.cli.Main"
            classpath = configurations.cucumberRuntime + sourceSets.main.output + sourceSets.test.output
            args = ['--plugin', 'pretty', '--glue', '.', 'src/test/resources']
        }
    }
}
```

Then, you need to create the `features` directory inside the `src/test/resources` dir in your project.
This is the place for your feature file(s).

In the `src/test/java` directory create the Java class file(s) for your steps.
Alternatively, use the Cucumber plugin to create the file(s) for you.


## Execute

1. Add more tests to your feature file(s). Unrecognized steps will be highlighted in the IDE.
   With help from the Cucumber plugin add missing steps to the context file(s).

1. Alternatively, run the tests. Cucumber will recognize missing steps and will tell
   you what to add to the context file(s).

1. Fill the new methods with your code that do what the steps suggest.

1. Run your tests with:
```bash
./gradlew cucumber
```
Alternatively, you can run tests directly from InteliJ or other IDE using the Cucumber plugin.


## License

[MIT](https://choosealicense.com/licenses/mit/)


## 🔗 Links
[![github](https://img.shields.io/badge/github-000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/daropotter)
[![gitlab](https://img.shields.io/badge/gitlab-003385?style=for-the-badge&logo=gitlab&logoColor=white)](https://gitlab.com/daropotter)
[![gitlab](https://img.shields.io/badge/discord-0A66C2?style=for-the-badge&logo=discord&logoColor=white)](https://discordapp.com/users/355099945805807627)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/daropotter)

