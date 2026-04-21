# 📚 Exercícios de Algoritmos em Java - Comecei 23/03/2026

Repositório com exercícios de lógica de programação desenvolvidos em Java, abordando estruturas condicionais, operações matemáticas e entrada de dados pelo teclado.

---

## 📋 Lista de Exercícios

| # | Exercício | Arquivo |
|---|-----------|---------|
| 01 | Três Números | `TresNumeros.java` |
| 02 | Máquina de Vendas | `MaquinaVendas.java` |
| 03 | Equação do Segundo Grau | `EquacaoSegundoGrau.java` |
| 04 | Círculo e Esfera | `CirculoEsfera.java` |
| 05 | Calculadora | `Calculadora.java` |
| 06 | Sorteio de Números | `Sorteio.java` |

---

## 🔍 Detalhes dos Exercícios

### 01 - Três Números (`TresNumeros.java`)

Lê 3 números pelo teclado e calcula:

- ✅ O **maior** número
- ✅ O **menor** número
- ✅ A **média aritmética** dos três

**Exemplo de execução:**
```
Digite o 1º número: 8
Digite o 2º número: 3
Digite o 3º número: 5

Maior número : 8.0
Menor número : 3.0
Média aritmética: 5,33
```

---

### 02 - Máquina de Vendas (`MaquinaVendas.java`)

Simula uma máquina de venda automática de salgadinhos, doces, sucos e refrigerantes.

- ✅ Lê o valor da compra e o valor pago
- ✅ Valida se o pagamento é suficiente
- ✅ Calcula o **menor número de notas** para o troco
- ✅ Aceita notas de: R$ 50, R$ 20, R$ 10, R$ 5, R$ 2 e R$ 1

**Exemplo de execução:**
```
Valor da compra: R$ 23,00
Valor pago     : R$ 100,00
Troco          : R$ 77,00

Notas de R$ 50,00 : 1
Notas de R$ 20,00 : 1
Notas de R$ 10,00 : 0
Notas de R$  5,00 : 1
Notas de R$  2,00 : 1
Notas de R$  1,00 : 0
```

---

### 03 - Equação do Segundo Grau (`EquacaoSegundoGrau.java`)

Resolve equações do tipo `ax² + bx + c = 0` com validação completa.

- ✅ Se `a=0`, `b=0` e `c≠0` → **"Coeficientes informados incorretamente"**
- ✅ Se `a=0` e `b≠0` → **Equação de 1º grau** com cálculo da raiz
- ✅ Se `Δ < 0` → **Sem raízes reais**
- ✅ Se `Δ = 0` → **Duas raízes iguais**
- ✅ Se `Δ > 0` → **Duas raízes diferentes**

**Fórmulas utilizadas:**
```
Δ = b² - 4ac
x = (-b ± √Δ) / 2a
```

**Exemplo de execução:**
```
a=1, b=-5, c=6
Delta = 1.00
x¹ = 3.00
x² = 2.00
```

---

### 04 - Círculo e Esfera (`CirculoEsfera.java`)

Lê um código de operação e o raio, e realiza o cálculo correspondente.

| Código | Operação | Fórmula |
|--------|----------|---------|
| 1 | Perímetro do Círculo | `2 × π × r` |
| 2 | Área do Círculo | `π × r²` |
| 3 | Volume da Esfera | `(4/3) × π × r³` |

> Utiliza `π = 3.141592`

**Exemplo de execução:**
```
Código: 3 | Raio: 5
Volume = 4/3 × π × 5³
Volume = 523,5987
```

---

### 05 - Calculadora (`Calculadora.java`)

Lê dois números e um símbolo de operação e retorna o resultado.

| Símbolo | Operação |
|---------|----------|
| `+` | Adição |
| `-` | Subtração |
| `*` | Multiplicação |
| `/` | Divisão (com verificação de divisão por zero) |
| `^` | Potenciação (`Math.pow`) |

- ✅ Valida símbolo inválido
- ✅ Protege contra divisão por zero

**Exemplo de execução:**
```
Num1: 2 | Num2: 8 | Operação: ^
2.00 ^ 8.00 = 256.00
```

---

### 06 - Sorteio de Números (`Sorteio.java`)

Lê dois números inteiros e sorteia um número aleatório no intervalo entre eles.

- ✅ Detecta automaticamente qual é o **menor** e o **maior** (independente da ordem digitada)
- ✅ Informa se o número sorteado é **PAR** ou **ÍMPAR**

**Exemplo de execução:**
```
Primeiro número: 10
Segundo número : 3
Intervalo: 3 a 10
Número sorteado: 7
O número 7 é ÍMPAR.
```

---

## 🛠️ Como Executar

### Pré-requisitos

- [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado (versão 8 ou superior)

### Compilar e executar

```bash
# Compilar
javac NomeDoArquivo.java

# Executar
java NomeDoArquivo
```

**Exemplo:**
```bash
javac TresNumeros.java
java TresNumeros
```

---

## 🧠 Conceitos Abordados

- Entrada de dados com `Scanner`
- Estruturas condicionais (`if`, `else if`, `else`)
- Operadores aritméticos e lógicos
- Uso de `Math.sqrt()`, `Math.pow()`, `Math.round()`
- Geração de números aleatórios com `Random`
- Formatação de saída com `printf` e `%.2f`
- Comparação de `String` com `.equals()`
- Operador módulo `%` para verificar par/ímpar

---

## 👨‍💻 Tecnologias

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

---

> Exercícios desenvolvidos para fins educacionais, com foco em lógica de programação e estruturas condicionais em Java.
