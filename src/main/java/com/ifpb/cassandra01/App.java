
package com.ifpb.cassandra01;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.Statement;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import static com.datastax.driver.core.querybuilder.QueryBuilder.eq;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        Cluster cluster = Cluster.builder().addContactPoint("localhost").build();
        
        Session session = cluster.connect("aula");

//        PreparedStatement stmt = session.prepare("INSERT INTO pessoa (cpf,nome,idade,gostos) VALUES (?,?,?,?)");
//        
//        Pessoa p = new Pessoa("333.333.333.03","Pedro", 32);
//        List<String> gostos = new ArrayList<>();
//        gostos.add("Java");
//        gostos.add("Cassandra");
//        p.setGostos(gostos);
//        
//        BoundStatement bs = stmt.bind(p.getCpf(),p.getNome(),p.getIdade(),p.getGostos());
//        
//        session.execute(bs);
        


        //Statement stmt = QueryBuilder.select().all().from("pessoa").where(eq("cpf","111.111.111-01"));
//        Statement stmt = QueryBuilder.select().column("nome").from("pessoa").where(eq("cpf","222.222.222.02"));
//        ResultSet rs = session.execute(stmt);
//        List<Row> linhas = rs.all();
//        
//        for(Row r : linhas){
//            Pessoa p = new Pessoa();
//            p.setCpf(r.getString("cpf"));
//            p.setIdade(r.getInt("idade"));
//            p.setNome(r.getString("nome"));
//            p.setGostos(r.getList("gostos", String.class));
            
//            System.out.println(r.getString("nome"));
//        }


//        Statement stmt = QueryBuilder.delete().from("pessoa").where(eq("cpf","333.333.333.03"));
//        session.execute(stmt);



//        Endereco end = new Endereco("Rua X", 30, "Cajazeiras");
//        Pessoa2 p2 = new Pessoa2("333.333.333-03", "Lyndemberg", 21, end);
//        
//        PreparedStatement pstmt = session.prepare("INSERT INTO pessoa2 (cpf,nome,idade,endereco) VALUES"
//                                                    + "(?,?,?,{rua:?,cidade:?, numero:?})");
//        BoundStatement bstmt = pstmt.bind(p2.getCpf(),p2.getNome(),p2.getIdade(),p2.getEndereco().getRua(),p2.getEndereco().getCidade()
//                                          ,p2.getEndereco().getNumero());
//        
//        session.execute(bstmt);

//        PreparedStatement pstmt = session.prepare("SELECT cpf,nome,idade,endereco.rua,endereco.cidade,endereco.numero FROM pessoa2");
//        BoundStatement bstmt = pstmt.bind();
//        ResultSet rs = session.execute(bstmt);
//        List<Row> linhas = rs.all();
//        for(Row r: linhas){
//            Pessoa2 p2 = new Pessoa2();
//            p2.setCpf(r.getString("cpf"));
//            p2.setNome(r.getString("nome"));
//            p2.setIdade(r.getInt("idade"));
//            Endereco end = new Endereco();
//            end.setCidade(r.getString("endereco.cidade"));
//            end.setRua(r.getString("endereco.rua"));
//            end.setNumero(r.getInt("endereco.numero"));
//            p2.setEndereco(end);
//            System.out.println(p2);
//        }
        

        session.close();
        cluster.close();
        
        
    }
    
}
