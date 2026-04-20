# ☕ Mastering POO: A Jornada da Abstração ao Código

![Status do Projeto](https://img.shields.io/badge/Status-Em%20Desenvolvimento-blue?style=for-the-badge)
![Linguagem](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

Este repositório é um laboratório prático dedicado ao estudo e implementação dos pilares da **Programação Orientada a Objetos (POO)**. Aqui, transformo conceitos teóricos como herança, polimorfismo, abstração e interfaces em implementações reais utilizando a linguagem Java.

## 🚀 Tecnologias Utilizadas

<div align="center">
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" height="60" alt="Java logo" />
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/intellij/intellij-original.svg" height="60" alt="IntelliJ logo" />
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-original.svg" height="60" alt="Git logo" />
</div>

---

## 📂 Estrutura de Aprendizado

O projeto está organizado por módulos temáticos que abordam diferentes desafios da POO:

### 🏛️ Fundamentos & Estruturas
*   **Person & Records:** Exploração de classes tradicionais vs. `Record` para imutabilidade de dados.
*   **Lists & Arrays:** Implementações personalizadas e manipulação de coleções Java.

### 🎭 Herança e Polimorfismo (`/herancaEpolimorfismo01`)
*   **Sistema de RH:** Simulação de funcionários (`Employee`), gerentes (`Manager`) e desenvolvedores (`Develop`), demonstrando como o comportamento especializado sobrescreve o genérico.

### 🔌 Interfaces e Abstração (`/Interfaces`, `/exercicio_interfaces`)
*   **Multimídia:** Modelagem de dispositivos como `Smartphone`, `Computer` e `MusicBox` compartilhando contratos de interface para reprodução de áudio e vídeo.
*   **Geometria:** Cálculo de áreas e perímetros para `Square`, `Circle` e `Rectangle` via interfaces.

### 🛠️ Casos Práticos (Exercícios)
*   **PetShop:** Sistema de automação para banho e tosa utilizando estados de objetos.
*   **Relógio Global:** Implementação de `BRLClock` e `USClock` para entender polimorfismo temporal e herança de classes abstratas.

---

## 🔧 Como Executar o Projeto

1.  **Pré-requisitos:**
    *   Java JDK 17 ou superior instalado.
    *   Sua IDE de preferência (recomendado: IntelliJ IDEA).

2.  **Clonagem:**
    ```bash
    git clone https://github.com/flaviare1s/poo-estudos.git
    cd poo-estudos
    ```

3.  **Execução:**
    Cada pasta de exercício possui sua própria classe `Main.java`. Para testar o módulo de PetShop, por exemplo:
    ```bash
    javac src/exercicio03_petshop/*.java
    java src/exercicio03_petshop/MenuPetShop
    ```

---

## 🧠 Conceitos Aplicados

*   **Abstração:** Criação de classes modelo que representam entidades do mundo real.
*   **Encapsulamento:** Proteção de dados sensíveis e exposição controlada via métodos.
*   **Herança:** Reutilização de código e criação de hierarquias de classes.
*   **Polimorfismo:** Capacidade de um objeto ser referenciado de várias formas, permitindo flexibilidade no código.

---
*Este repositório serve como documentação de evolução técnica e portfólio de estudos em Java.*