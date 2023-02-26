# Camadas (Três Camadas - Three Layer)

Separation of Concerns Principle (SoC)
(Princípio da Separação de Interesses), 
cada camada representa um interesse distinto!

```plain
+----------------------------------------------+---------+
| Presentation   | Apresentação      | UI      |Cross    |
+----------------------------------------------+Cutting  |
| Business Logic | Lógica do Negócio | Domínio |Concerns |
+----------------------------------------------+ Ex.: Logging,Segurança,...|
| Persistence | Data Access | Persistência     |         |
+----------------------------------------------+---------+
```

Podem ser lógicas ou físicas (layer ou tier).

Depende do tipo de aplicação:

* Web <- aqui
  * SPA (Single Page Application)
* Mobile (Android, iOS, Nativo, Híbrido)
* Desktop (Windows, Mac OS, Linux, Multiplataforma)
* VUI (Voice User Interface, ex: Alexa)
* Embedded (Central Multimídia Veícular, etc)

# Persistência | Acesso a Dados | Data Source

**Mapeamento**: por que mapeamento é um problema? 

Algum tipo de fonte de dados (ex: Banco de Dados, Fila de msgs, etc)
Algum tipo de aplicação, escrita em alguma linguagem, rodando sobre alguma plataforma (ex.: Web escrita em Java rodando num servidor)

_Impedance Mismatch_ (Diferença de Impedância)
https://en.wikipedia.org/wiki/Object%E2%80%93relational_impedance_mismatch

Diferença de Modelo:

Java, paradigma => Orientado à Objetos (Classe/Objeto)
Classe: define a estrutura do objeto
Objeto: é uma instância de uma classe

PostgreSQL, paradigma => Relacional (Tabela/Registro)
Tabela: define a estrutura de um registro
Registro: é um conjunto de dados


Objeto <=> Relação
Orientado a Objetos <=> Relacional

Mapeamento Objeto/Relacional (ORM: Object/Relational Mapping)

Software Entropy (Entropia de Software)

```java
public class Chamado {

    public enum Situacao {
        NOVO, 
        ANDAMENTO, 
        CONCLUIDO;
    }

    private Long numero;
    private String autor; // obrigatório
    private String titulo; // obrigatório
    private String descricao;
    private LocalDateTime dataHora = LocalDateTime.now();
    private Situacao situacao = Situacao.NOVO;

}
```

```SQL
CREATE TABLE chamado (
    numero SERIAL PRIMARY KEY,
    autor  VARCHAR(50) NOT NULL,
    titulo VARCHAR(100) NOT NULL,
    descricao TEXT,
    datahora TIMESTAMP DEFAULT NOW(),
    situacao VARCHAR(20)
);
```
