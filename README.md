# Coleção de Consoles 

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Unifacisa](https://img.shields.io/badge/Unifacisa-2026-blue?style=for-the-badge)

Sistema que simula uma **coleção de consoles** usando o conceito de **Pilha (Stack)** em Java.

Projeto acadêmico desenvolvido durante o curso de **Análise e Desenvolvimento de Sistemas (ADS)** - Unifacisa.

---

## Sobre o Projeto

A ideia do projeto é representar uma **caixa de consoles** onde o usuário vai adicionando seus videogames. 

Como em uma pilha real:
- O primeiro console adicionado fica **embaixo**
- Os consoles mais recentes ficam **por cima**
- Para remover um console, é necessário remover primeiro os que estão acima (LIFO - Last In, First Out)

---

## Funcionalidades

- **Adicionar** um console na coleção (Push)
- **Remover** o console mais recente (Pop)
- **Visualizar** o console que está no topo da pilha (Peek)
- **Listar** todos os consoles da coleção
- **Verificar** se a pilha está vazia
- **Menu interativo** no console

---

## Tecnologias e Conceitos Aplicados

- **Java** (JDK 17+)
- **Estrutura de Dados**: Pilha (Stack)
- **Programação Orientada a Objetos (POO)**:
  - Encapsulamento
  - Classes e Objetos
- **ArrayList** como base para implementação da Pilha
- **Console Application**

---

## Estrutura do Projeto

```bash
src/
├── Main.java              # Ponto de entrada e menu principal
├── Console.java           # Classe que representa cada videogame
├── PilhaConsoles.java     # Implementação da Pilha personalizada
└── Metodos.java           # Métodos auxiliares e regras de negócio
```

## Como Executar

1. Clone o repositório:
```
git clone https://github.com/ssanctorum/Colecao-de-Consoles.git
```

2. Compile os arquivos:
```
javac src/*.java
```

3. Execute o programa:
```
java src.Main
```
