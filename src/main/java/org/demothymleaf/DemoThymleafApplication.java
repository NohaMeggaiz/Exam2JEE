package org.demothymleaf;

import org.demothymleaf.entity.Student;
import org.demothymleaf.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoThymleafApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoThymleafApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

        
           /*Student student1 = new Student("Loki", "Lauffyson", "lowkey@gmail.com");
           studentRepository.save(student1);
          
           Student student2 = new Student("Black", "Widow", "slayin@gmail.com");
           studentRepository.save(student2);
          
           Student student3 = new Student("tony", "stark", "tony@gmail.com");
           studentRepository.save(student3);

*/
    }
}
