# jmix-repo-test-module

Repository ([link](https://github.com/nekogochanPomoika/jmix-repo-test-module/blob/master/jmix-repo-test-module/src/main/java/com/company/jmixrepotestmodule/repository/NewEntityRepository.java)):
```lang=java
public interface NewEntityRepository extends JmixDataRepository<NewEntity, UUID> {
}
```

Service ([link](https://github.com/nekogochanPomoika/jmix-repo-test-module/blob/master/jmix-repo-test-module/src/main/java/com/company/jmixrepotestmodule/service/NewEntityService.java)):
```lang=java
@Service
public class NewEntityService {
    private final NewEntityRepository newEntityRepository;

    public NewEntityService(NewEntityRepository newEntityRepository) {
        this.newEntityRepository = newEntityRepository;
    }
}
```
