# ☕ Guia de Interfaces em Java

Uma **interface** em Java é um dispositivo que permite definir um contrato para o que uma classe deve fazer, sem especificar como ela faz. É um dos pilares da Programação Orientada a Objetos (POO).

---

## 📖 1. O Conceito
Pense na interface como um **manual de instruções** ou um **contrato legal**:
* A interface define os **métodos** (o "quê").
* A classe que implementa define a **lógica** (o "como").

---

# 🐾 Exemplo de Interface Java: Reino Animal

Este documento apresenta um exemplo prático de como usar interfaces para padronizar o comportamento de diferentes classes (Polimorfismo).

---

## 🏗️ 1. O Contrato (Interface)

A interface `Animal` define o que todo animal no nosso sistema deve ser capaz de fazer. Note que não definimos *como* eles fazem isso aqui.

```java
public interface Animal {
    // Métodos abstratos (obrigatórios para quem implementar)
    void emitirSom();
    void dormir();

    // Método default (opcional, já possui uma lógica padrão)
    default void respirar() {
        System.out.println("O animal está respirando mecanicamente...");
    }
}
