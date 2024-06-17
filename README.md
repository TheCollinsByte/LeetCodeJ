<div align="center">

<h1><a href="https://github.com/TheOddagen/LeetCodeJ">LeetCodeJ</a></h1>

<a href="https://github.com/TheOddagen/LeetCodeJ/blob/main/LICENSE">
<img alt="License" src="https://img.shields.io/github/license/TheOddagen/LeetCodeJ?style=flat&color=eee&label="> </a>

<a href="https://github.com/TheOddagen/LeetCodeJ/graphs/contributors">
<img alt="People" src="https://img.shields.io/github/contributors/TheOddagen/LeetCodeJ?style=flat&color=ffaaf2&label=People"> </a>

<a href="https://github.com/TheOddagen/LeetCodeJ/stargazers">
<img alt="Stars" src="https://img.shields.io/github/stars/TheOddagen/LeetCodeJ?style=flat&color=98c379&label=Stars"> </a>

<a href="https://github.com/TheOddagen/LeetCodeJ/network/members">
<img alt="Forks" src="https://img.shields.io/github/forks/TheOddagen/LeetCodeJ?style=flat&color=66a8e0&label=Forks"> </a>

<a href="https://github.com/TheOddagen/LeetCodeJ/watchers">
<img alt="Watches" src="https://img.shields.io/github/watchers/TheOddagen/LeetCodeJ?style=flat&color=f5d08b&label=Watches"> </a>

<a href="https://github.com/TheOddagen/LeetCodeJ/pulse">
<img alt="Last Updated" src="https://img.shields.io/github/last-commit/TheOddagen/LeetCodeJ?style=flat&color=e06c75&label="> </a>

</div>

## Description

LeetCodeJ is an open-source project where I solve LeetCode challenges using Java. The aim is to provide efficient and well-documented solutions to a variety of coding problems.

- [Installation](#installation)
- [Usage](#usage)
- [Solutions](#solutions)
- [Contributing](#contributing)
- [License](#license)

## Installation

Instructions on how to set up the project on a local machine:

1. Clone the repository:
    ```bash
    git clone https://github.com/TheOddagen/LeetCodeJ
    ```
2. Navigate to the project directory:
    ```bash
    cd LeetCodeJ
    ```
3. Ensure you have JDK version 21 installed. You can download it [here](https://www.oracle.com/java/technologies/downloads/#java21).

4. Compile the project:
    ```bash
   ./gradlew build
    ```
5. Run the project:
    ```bash
    ./gradlew :{MODULE_NAME}:test -Dtest.verbose=true
    ```
   
## Usage

Each solution is a separate subproject within the Gradle multi-project setup, organized by specific challenge topics. To verify the solutions, you can run tests for specific subprojects, all tests within a module and all test for all Sub-Projects in verbose mode.

### Run all test within a module in verbose mode

To run all tests within a module, use the following command:

```shell
./gradlew :array:test -Dtest.verbose=true
```

### Run a specific Test Method in verbose mode

To run a specific test method, use the following command:

```shell
./gradlew :array:test --tests com.collo.TwoSumSolverTest.checkPair -Dtest.verbose=true
```

### Run Tests for All Subprojects in verbose Mode

To run tests for all subprojects in verbose mode:

```shell
./gradlew test -Dtest.verbose=true
```

## Solutions

### Arrays
- [Two Sum](array/src/main/java/com/collo/TwoSum.java)

## Contributing

Contributions are Welcome! Please follow these steps:

1. Fork the repository.
2. create a new branch (`git checkout -b name-leetcode-challange-number-branch`)
3. Make your changes and commit them (`git commit -m "Leetcode challange number #1: Solutions"`)
4. Push to the branch (`git push origin name-leetcode-challange-number-branch`).
5. Create a new Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

<br/><br/>

<div align="center">

<strong>⭐ hit the star button if you found this useful ⭐</strong><br>

<a href="https://github.com/TheOddagen/Mobile-Payments-Library">Source</a>
| <a href="https://x.com/TheOddagen" target="_blank">Twitter </a>
| <a href="http://www.linkedin.com/in/collins-boniface" target="_blank">LinkedIn </a>
| <a href="mailto:collo@fastmail.com">Email</a>
</div>
