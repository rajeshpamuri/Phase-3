packagecom.project.SpringSecurity.repositories;
importjava.util.Optional;
importorg.springframework.data.repository.CrudRepository;
importorg.springframework.stereotype.Repository;
importcom.project.SpringSecurity.entities.User;
@Repository
publicinterfaceUsersRepositoryextendsCrudRepository<User, Integer>{
public Optional<User>findUserByName(String name); 
}