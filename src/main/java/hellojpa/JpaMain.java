package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.List;

public class JpaMain {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{
//            Member member = new Member();
//            member.setId(1L);
//            member.setName("helloA");
//
//            em.persist(member);
//=====================================================================
//            Member findMember = em.find(Member.class, 1L);
//            findMember.setName("helloJpa");
//=====================================================================
//            List<Member> result = em.createQuery("select m from Member as m",Member.class)
//                    .setFirstResult(1)
//                    .setMaxResults(10)
//                    .getResultList();
//            for(Member member : result){
//                System.out.println("member.name =" + member.getName());
//            }
//=====================================================================
//            Movie movie = new Movie();
//            movie.setDirector("aa");
//            movie.setActor("A");
//            movie.setName("바람");
//            movie.setPrice(10000);
//
//            em.persist(movie);
//
//            em.flush();
//            em.clear();
//
//            Movie findMovie = em.find(Movie.class, movie.getId());
//            System.out.println(findMovie);
//=====================================================================
            Parent parent = new Parent();
            Child child1 = new Child();
            Child child2 = new Child();
            parent.addChild(child1);
            parent.addChild(child2);

            em.persist(parent);

            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
