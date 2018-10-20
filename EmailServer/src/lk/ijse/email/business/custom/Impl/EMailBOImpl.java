/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.email.business.custom.Impl;

import lk.ijse.email.business.custom.EMailBO;
import lk.ijse.email.dto.EmailDTO;
import lk.ijse.email.dto.MessageDTO;
import lk.ijse.email.entity.EMail;
import lk.ijse.email.repository.RepositoryFactory;
import lk.ijse.email.repository.custom.EMailRepository;
import lk.ijse.email.resources.NewHibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Chamini
 */
public class EMailBOImpl implements EMailBO{
    
    public EMailRepository emailRepository;
    
    public EMailBOImpl(){
        this.emailRepository=(EMailRepository) RepositoryFactory.getRepositoryFactory().getRepository(RepositoryFactory.repositoryType.EMAIL);
    } 
    @Override
    public boolean addEMail(EmailDTO emailDTO,MessageDTO msgDTO) throws Exception {
     
        try(Session session=NewHibernateUtil.getSessionFactory().openSession()){
            emailRepository.setSession(session);
            session.beginTransaction();
            
            EMail mail=new EMail(emailDTO.getAttaches(), emailDTO.getContent(), emailDTO.getSubject(), emailDTO.getName(), emailDTO.getDate(), emailDTO.getTime(), emailDTO.getType());
            boolean save = emailRepository.save(mail);
            session.getTransaction().commit();
            return save;
        }
    }
    
}
