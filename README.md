# 🧪 Avaliação de Teste em Java – LoginService

Este repositório contém um **projeto Java** com estrutura Maven, destinado à **avaliação prática** de testes automatizados utilizando **JUnit 5** e análise de cobertura com **JaCoCo**.

---

## 🎯 Objetivo

Você deverá **escrever testes automatizados** para validar o comportamento de um sistema simples de autenticação (`LoginService`). A execução dos testes e a verificação da cobertura de código são feitas automaticamente pelo **GitHub Actions**.

---

## 📄 Estrutura do Projeto

login-avaliacao-java/

├── src/

│ ├── main/java/auth/LoginService.java # Classe a ser testada

│ └── test/java/auth/LoginServiceTest.java # Classe de teste (parcial)

├── pom.xml # Configuração do Maven

└── .github/workflows/test.yml # Pipeline de testes automática


## 📌 Regras e Instruções

1. **Clone ou faça um fork deste repositório** para seu próprio GitHub.
2. Complete a classe de teste `LoginServiceTest.java` com os seguintes casos:
   - ✅ Login correto (já implementado)
   - ❌ Login com usuário incorreto
   - ❌ Login com senha incorreta
   - ❌ Login com usuário `null`
   - ❌ Login com senha `null`
3. Faça **commit e push** das suas alterações.
4. Acesse a aba **"Actions"** do seu repositório para verificar:
   - Se os testes foram executados com sucesso ✅
   - Se a cobertura de código está adequada 📊

---

## 🛠️ Ferramentas utilizadas

| Ferramenta     | Finalidade                           |
|----------------|--------------------------------------|
| JUnit 5        | Testes automatizados                 |
| JaCoCo         | Análise de cobertura de código       |
| Maven          | Gerenciamento do projeto Java        |
| GitHub Actions | Execução automática dos testes       |

---

## 📊 Acesso ao Relatório de Cobertura (JaCoCo)

Este projeto utiliza o **JaCoCo** para gerar relatórios de cobertura de código. O relatório completo pode ser visualizado online via **GitHub Pages**.

### 🔗 Acesse aqui:
👉 [Relatório JaCoCo – index.html](https://SEU_USUARIO.github.io/NOME_DO_REPOSITORIO/index.html)

> ⚠️ **Importante**: Substitua `SEU_USUARIO` e `NOME_DO_REPOSITORIO` pela sua conta e nome real do repositório no GitHub.

---

### 📄 Como foi gerado o relatório?

Após rodar os testes com Maven, o JaCoCo cria um relatório em:

target/site/jacoco/index.html

Esse relatório foi copiado para a pasta `docs/` para que o GitHub Pages possa publicá-lo automaticamente.

---

### 💡 Dica

Se quiser gerar novamente o relatório localmente:

mvn clean test jacoco:report

E copie os arquivos de target/site/jacoco/ para docs/ para atualizar o relatório publicado.

---

🔧 **Exemplo pronto (preenchido):**

Se o seu usuário for `username` e o repositório se chamar `avaliacao-java-jacoco`, o link final será:

https://username.github.io/avaliacao-java-jacoco/index.html
---
## 🧾 Critérios de Avaliação

| Critério                          | Pontuação |
|-----------------------------------|-----------|
| Implementou todos os testes       | 4.0       |
| Testes executam corretamente      | 2.0       |
| Cobertura de código ≥ 90% (JaCoCo)| 2.0       |
| Organização e clareza do código   | 2.0       |
| **Total**                         | **10,0**  |	
