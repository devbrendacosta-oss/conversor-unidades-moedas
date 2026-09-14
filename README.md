# Conversor de Unidades e Moedas

**Grupo 5** — Disciplina de Elicitação e programação / Sistemas de Desenvolvimento

## 👥 Desenvolvedores
* Anna Gabriela Dimas Furtado
* Brenda Sousa Costa 
* Nikoly Karoline De Paula Pereira
* Maria Vitória Pereira dos Santos 
* Matheus Souza de Jesus
* Thallys Maycon de Jesus Silva 
## 👤​Professor
* Hudson Neves E Silva


---

## 🎥 Vídeo do Pitch Técnico

https://drive.google.com/file/d/1T2IkgaPahvywIhIsdObAou2QcvbZaGR9/view?usp=drivesdk

---

## 📌 Sobre o projeto

Este é um sistema de console desenvolvido em **Java**, executado na IDE **Eclipse**, que realiza conversões entre diferentes unidades de medida e moedas. Durante a execução, cada conversão feita pelo usuário é registrada em um **histórico em memória**, permitindo consultar as operações realizadas na sessão atual.

A proposta do projeto foi ir além de apenas escrever código: pensar em como um usuário navegaria pelo sistema, validar as entradas com cuidado e organizar a lógica em classes bem definidas, aplicando conceitos de modularização e encapsulamento.

---

## ⚙️ Funcionalidades

O sistema é dividido em um menu principal com 4 categorias:

- **🌡️ Temperatura** — conversões entre Celsius, Fahrenheit e Kelvin (nas duas direções)
- **📏 Comprimento** — conversões entre Metros, Centímetros e Quilômetros (nas duas direções)
- **💰 Moedas** — conversões entre Real, Dólar e Euro, com taxas fixas
- **🕘 Histórico** — exibe todas as conversões realizadas durante a sessão

Cada submenu permite voltar ao menu principal (opção `0`), e o sistema só é encerrado quando o usuário escolhe sair pelo menu principal.

---

## 🧱 Estrutura do projeto

```
ConversorUnidadesMoedas/
└── src/
    └── conversor/
        ├── Main.java                    # Menus, fluxo do programa e leitura de entradas
        ├── ConversorTemperatura.java    # Métodos estáticos de conversão de temperatura
        ├── ConversorComprimento.java    # Métodos estáticos de conversão de comprimento
        ├── ConversorMoeda.java          # Métodos estáticos de conversão de moedas
        └── Historico.java               # Armazena e exibe o histórico de conversões (ArrayList)
```

Cada classe de conversão tem uma responsabilidade única, o que mantém o `Main` focado no fluxo do menu e na interação com o usuário — sem misturar regra de negócio com interface de console.

---

## ✅ Validações implementadas

- **Entradas não numéricas** (ex.: digitar `abc` em vez de um número) são rejeitadas com uma mensagem de erro, e o programa pede a entrada novamente.
- **Valores negativos** são bloqueados onde não fazem sentido físico ou financeiro (comprimento, moedas e Kelvin), exibindo mensagem de erro.
- **Opções inválidas de menu** exibem aviso e retornam ao próprio menu, sem travar o programa.

---

## ▶️ Como executar

1. Importe a pasta `ConversorUnidadesMoedas` no Eclipse como um projeto Java existente (**File → Import → Existing Projects into Workspace**).
2. Abra a classe `Main.java`.
3. Execute como **Java Application** (`Run As → Java Application`).
4. Interaja pelo console: escolha uma categoria, informe os valores solicitados e veja o resultado.
5. A qualquer momento, escolha a opção **4** no menu principal para ver o histórico da sessão.

---

## 🧪 Testes realizados

Os testes cobriram os três módulos de conversão, tratamento de entradas inválidas, valores negativos e o histórico. Todos os casos retornaram o resultado esperado:

| # | Teste | Entrada | Resultado esperado | Status |
|---|-------|---------|---------------------|--------|
| 1 | Celsius → Fahrenheit | 100 °C | 212.00 °F | ✅ OK |
| 2 | Metros → Centímetros | 5 m | 500.00 cm | ✅ OK |
| 3 | Real → Dólar | 100 R$ | 20.00 US$ | ✅ OK |
| 4 | Entrada de texto | "abc" | mensagem de entrada inválida | ✅ OK |
| 5 | Valor negativo em comprimento | -5 m | mensagem de erro | ✅ OK |
| 6 | Kelvin negativo | -10 K | mensagem de erro | ✅ OK |
| 7 | Histórico | várias conversões | histórico exibido corretamente | ✅ OK |

---

## ✅ Conformidade com os requisitos do projeto

| Requisito | Como foi atendido |
|---|---|
| Menu de categorias | Menu principal com Temperatura, Comprimento, Moedas e Histórico |
| Métodos estáticos por categoria | `ConversorTemperatura`, `ConversorComprimento` e `ConversorMoeda` |
| Histórico em `ArrayList` | Classe `Historico`, dados mantidos só em memória |
| Interface via console | `Scanner` para entrada e `System.out` para saída — sem interface gráfica |
| Sem persistência em arquivo/banco | Histórico existe apenas durante a execução do programa |
| Modularização (sem lógica no `main`) | Cada menu é um método separado; conversões ficam em classes próprias |
| Tratamento de exceções | Validação de texto inválido e de valores negativos |

---

## 🛠️ Etapas de desenvolvimento

1. Criação da estrutura inicial do projeto e das classes principais
2. Implementação das conversões de temperatura
3. Implementação das conversões de comprimento
4. Implementação das conversões de moedas
5. Implementação do histórico das conversões usando `ArrayList`
6. Adição da validação de entradas inválidas
7. Adição da validação de valores negativos quando necessário
8. Realização dos testes e ajustes finais

---

## 🧑‍💻 Tecnologias

- Java SE
- IDE Eclipse
- `java.util.Scanner` para entrada de dados
- `java.util.ArrayList` para o histórico (100% em memória, sem persistência em arquivo ou banco de dados)
