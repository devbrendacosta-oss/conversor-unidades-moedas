# Conversor de Unidades e Moedas

## 🎓 Identificação Acadêmica

* **Instituição de Ensino:** Centro Universitário do Planalto Central Apparecido dos Santos (UNICEPLAC)
* **Curso:** Engenharia de Software
* **Disciplina:** Elicitação e Programação 
* **Orientador:** Profº Hudson Neves

## 👥 Desenvolvedores do Projeto
* Anna Gabriela Dimas Furtado
* Brenda Sousa Costa 
* Nikoly Karoline De Paula Pereira
* Maria Vitória Pereira dos Santos 
* Matheus Souza de Jesus
* Thallys Maycon de Jesus Silva 


## 🎥 Vídeo do Pitch Técnico

🔗 [Assista aqui](https://drive.google.com/file/d/1T2IkgaPahvywIhIsdObAou2QcvbZaGR9/view?usp=drivesdk)

---

## 📌 Descrição

Este é um sistema de console desenvolvido em **Java**, executado na IDE **Eclipse**, que realiza conversões entre diferentes unidades de medida e moedas. Durante a execução, cada conversão feita pelo usuário é registrada em um **histórico em memória**, permitindo consultar as operações realizadas na sessão atual.

A proposta do projeto foi ir além de apenas escrever código: pensar em como um usuário navegaria pelo sistema, validar as entradas com cuidado e organizar a lógica em classes bem definidas, aplicando conceitos de modularização e encapsulamento.

## 🎯 Objetivos

**Objetivo geral:** oferecer uma ferramenta de console simples e confiável para conversão de unidades de temperatura, comprimento e moedas, com registro do histórico de operações realizadas durante a sessão.

**Problema que o sistema resolve:** evita cálculos manuais de conversão, centralizando as fórmulas em um único sistema validado, com tratamento de entradas inválidas e valores fora do domínio físico/financeiro.

**Público-alvo:** A ser definido pela equipe

---

## ⚙️ Funcionalidades

O sistema é dividido em um menu principal com 4 categorias:

- **🌡️ Temperatura** — conversões entre Celsius, Fahrenheit e Kelvin (nas duas direções)
- **📏 Comprimento** — conversões entre Metros, Centímetros e Quilômetros (nas duas direções)
- **💰 Moedas** — conversões entre Real, Dólar e Euro, com taxas fixas
- **🕘 Histórico** — exibe todas as conversões realizadas durante a sessão

Cada submenu permite voltar ao menu principal (opção `0`), e o sistema só é encerrado quando o usuário escolhe sair pelo menu principal.

### ✅ Validações implementadas

- **Entradas não numéricas** (ex.: digitar `abc` em vez de um número) são rejeitadas com uma mensagem de erro, e o programa pede a entrada novamente.
- **Valores negativos** são bloqueados onde não fazem sentido físico ou financeiro (comprimento, moedas e Kelvin), exibindo mensagem de erro.
- **Opções inválidas de menu** exibem aviso e retornam ao próprio menu, sem travar o programa.

---

## 🧑‍💻 Tecnologias Utilizadas

- Java SE
- IDE Eclipse
- `java.util.Scanner` para entrada de dados
- `java.util.ArrayList` para o histórico (100% em memória, sem persistência em arquivo ou banco de dados)

### Frameworks e bibliotecas

A ser definido pela equipe (projeto utiliza apenas bibliotecas padrão do Java SE, sem frameworks externos)

---

## 🏗️ Arquitetura da Solução

Sistema de console (aplicação Java standalone), sem camadas de rede ou interface gráfica. A lógica é organizada por responsabilidade em classes estáticas de conversão, uma classe de domínio para o histórico e uma classe `Main` responsável apenas pelo fluxo dos menus e pela interação com o usuário:

- Cada classe de conversão tem uma responsabilidade única, o que mantém o `Main` focado no fluxo do menu e na interação com o usuário — sem misturar regra de negócio com interface de console.
- O histórico é mantido em memória através de um `ArrayList<String>`, sem persistência.

## 🗄️ Modelagem do Banco de Dados

Não se aplica — o sistema não utiliza banco de dados. O histórico de conversões é armazenado apenas em memória (`ArrayList`) durante a execução do programa e é perdido ao encerrar a aplicação.

---

## 📋 Pré-requisitos

- Java Development Kit (JDK) instalado
- IDE Eclipse (ou outra IDE Java compatível)

## 🚀 Instalação

1. Faça o download ou clone este repositório.
2. Importe a pasta `ConversorUnidadesMoedas` no Eclipse como um projeto Java existente (**File → Import → Existing Projects into Workspace**).

## ▶️ Como Executar

1. Abra a classe `Main.java`.
2. Execute como **Java Application** (`Run As → Java Application`).
3. Interaja pelo console: escolha uma categoria, informe os valores solicitados e veja o resultado.
4. A qualquer momento, escolha a opção **4** no menu principal para ver o histórico da sessão.

---

## 🧱 Estrutura do Projeto

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

---

## 💡 Exemplos de Uso

**Conversão de temperatura (Kelvin → Celsius):**
```
Digite a temperatura em Kelvin: 100
Resultado em Celsius: -173,15 °C
```

**Conversão de comprimento (Metros → Centímetros):**
```
Digite o valor em metros: 90
Resultado: 9000,00 cm
```

**Conversão de moeda (Real → Dólar):**
```
Digite o valor em reais: 500
Resultado: US$ 100,00
```

**Histórico da sessão:**
```
========== HISTÓRICO ==========
1. 100,00 K → -173,15 °C
2. 90,00 m → 9000,00 cm
3. R$ 500,00 → US$ 100,00
================================
```

## 🔌 API

Não se aplica — o projeto é uma aplicação de console e não expõe endpoints de API.

## 🖼️ Capturas de Tela

- Interface
<img width="1445" height="943" alt="Interface" src="https://github.com/user-attachments/assets/f302f63b-1d0f-476a-b373-07b830164f4f" />

- Submenu de conversão de comprimento
<img width="1449" height="792" alt="Cnv de Comprimento" src="https://github.com/user-attachments/assets/2e05ed91-b3b9-4df8-a438-e63097976374" />

- Submenu de conversão de moedas
<img width="1443" height="775" alt="Cnv de Moedas" src="https://github.com/user-attachments/assets/48dd101d-8389-409e-89d7-00896ed59699" />

- Submenu de conversão de temperatura (Kelvin → Celsius)
<img width="1448" height="748" alt="Cnv Temperatura" src="https://github.com/user-attachments/assets/f7dab8a0-a363-41f7-be63-a11b870dbe68" />

- Exibição do histórico de conversões
<img width="1442" height="780" alt="Exibição do Histórico" src="https://github.com/user-attachments/assets/e076a3fe-770f-4f29-bf6d-5b9d8409ccb0" />

---

## 🧪 Testes Realizados

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

## ✅ Conformidade com os Requisitos do Projeto

| Requisito | Como foi atendido |
|---|---|
| Menu de categorias | Menu principal com Temperatura, Comprimento, Moedas e Histórico |
| Métodos estáticos por categoria | `ConversorTemperatura`, `ConversorComprimento` e `ConversorMoeda` |
| Histórico em `ArrayList` | Classe `Historico`, dados mantidos só em memória |
| Interface via console | `Scanner` para entrada e `System.out` para saída — sem interface gráfica |
| Sem persistência em arquivo/banco | Histórico existe apenas durante a execução do programa |
| Modularização (sem lógica no `main`) | Cada menu é um método separado; conversões ficam em classes próprias |
| Tratamento de exceções | Validação de texto inválido e de valores negativos |

## 🛠️ Etapas de Desenvolvimento

1. Criação da estrutura inicial do projeto e das classes principais
2. Implementação das conversões de temperatura
3. Implementação das conversões de comprimento
4. Implementação das conversões de moedas
5. Implementação do histórico das conversões usando `ArrayList`
6. Adição da validação de entradas inválidas
7. Adição da validação de valores negativos quando necessário
8. Realização dos testes e ajustes finais

---

## 📈 Status do Projeto

Concluído (MVP entregue para a disciplina)

## 🔭 Melhorias Futuras

A ser definido pela equipe

## 📄 Licença

"Projeto acadêmico desenvolvido para fins educacionais na disciplina de Elicitação e Programação — UNICEPLAC. Uso restrito aos fins do curso."
