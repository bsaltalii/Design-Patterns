package DependencyInversionPrinciple;

//public class UserRepository {
//    public void saveUser(String name){
//        System.out.println("User " + name + " saved to database");
//    }
//}
//
//class UserService{
//    private UserRepository userRepository = new UserRepository();
//
//    public void registerUser(String name){
//        userRepository.saveUser(name);
//    }
//}

interface UserRepositoryInterface{
    void saveUser(String name);
}

class UserRepository implements UserRepositoryInterface{
    @Override
    public void saveUser(String name){
        System.out.println("User " + name + " saved to database");
    }
}

class UserService{
    private UserRepositoryInterface userRepository;

    public UserService(UserRepositoryInterface userRepository){
        this.userRepository = userRepository;
    }

    public void registerUser(String name){
        userRepository.saveUser(name);
    }
}

class Main {
    public static void main(String[] args) {
        UserRepositoryInterface userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        userService.registerUser("John Doe");
    }
}