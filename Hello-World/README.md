## Primeiro Hello World em Java

Este projeto demonstra um exemplo simples de aplicação Java que imprime mensagens no console.

### Estrutura do Projeto

- `src/App.java`: Código-fonte principal da aplicação.
- `bin/`: Arquivos compilados (.class).
- `lib/`: Dependências externas (JARs).
- `.vscode/`: Configurações do Visual Studio Code.

### Como Executar

1. Compile o projeto:
   ```bash
   javac -d bin src/App.java
   ```
2. Execute o programa:

   ```bash
   java -cp bin App
   ```

### Dependências

- [Java SE Development Kit](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) 11 ou superior.
- [Visual Studio Code](https://code.visualstudio.com/) com a extensão Java.

### Dicas

- Utilize o terminal integrado do VS Code para compilar e executar o projeto.
- Verifique se as variáveis de ambiente `JAVA_HOME` e `PATH` estão configuradas corretamente.

### Problemas Comuns

- **Erro: `javac: command not found`**: Certifique-se de que o JDK está instalado e a variável de ambiente `PATH` inclui o diretório `bin` do JDK.
- **Erro: `Could not find or load main class`**: Verifique se você está executando o comando `java` a partir do diretório correto e se a classe principal está no classpath.

### Contribuindo

1. Faça um fork deste repositório.
2. Crie uma nova branch: `git checkout -b minha-feature`.
3. Faça suas alterações e commit: `git commit -m 'Adiciona nova feature'`.
4. Envie para o repositório remoto: `git push origin minha-feature`.
5. Abra um Pull Request.

### Agradecimentos

- Agradecimentos especiais ao [Professor X](https://github.com/professorx) pela orientação.
- Inspirado por exemplos do livro "Java: Como Programar" de Deitel & Deitel.

### Contato

- Para dúvidas, entre em contato pelo e-mail: contato@exemplo.com
- Siga-me no [LinkedIn](https://www.linkedin.com/in/seu-perfil/) para mais atualizações.

### Status do Projeto

[![Build Status](https://travis-ci.com/usuario/repo.svg?branch=main)](https://travis-ci.com/usuario/repo)
[![Coverage Status](https://coveralls.io/repos/github/usuario/repo/badge.svg?branch=main)](https://coveralls.io/github/usuario/repo?branch=main)

Projeto concluído e testado com sucesso. Pronto para produção.

### Roadmap

- [x] Configuração do projeto
- [x] Implementação da funcionalidade principal
- [ ] Testes automatizados
- [ ] Documentação completa
- [ ] Deploy em produção

### Notas Finais

Este é um projeto de exemplo para fins educacionais. Utilize como base para seus próprios projetos Java.

---

**Disclaimer**: Este projeto é fictício e criado apenas para fins de demonstração.

- O primeiro argumento (`21`) representa a versão do JDK.
- O segundo argumento (`Java`) representa a linguagem de programação.

### Saída Esperada
```
Hello, World!
```

### Requisitos

- JDK instalado
- Visual Studio Code (opcional)

### Personalização

Para alterar os argumentos, edite o arquivo `.vscode/launch.json` ou execute manualmente com diferentes valores.

---