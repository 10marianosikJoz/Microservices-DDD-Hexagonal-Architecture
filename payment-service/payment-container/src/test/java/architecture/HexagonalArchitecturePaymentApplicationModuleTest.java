package architecture;

import com.tngtech.archunit.core.importer.ClassFileImporter;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class HexagonalArchitecturePaymentApplicationModuleTest {

    private static final String PAYMENT_SERVICE_PACKAGE = "com.product.ordering";

    @Test
    void applicationModuleShouldNotDependOnAdaptersModule() {
        noClasses()
                .that()
                .resideInAnyPackage("..application..")
                .should()
                .dependOnClassesThat()
                .resideInAPackage("..adapters..")
                .check(new ClassFileImporter().importPackages(PAYMENT_SERVICE_PACKAGE));
    }

    @Test
    void applicationModuleShouldNotDependOnEntitiesModule() {
        noClasses()
                .that()
                .resideInAPackage("..application..")
                .should()
                .dependOnClassesThat()
                .resideInAPackage("..entities..")
                .check(new ClassFileImporter().importPackages(PAYMENT_SERVICE_PACKAGE));
    }

    @Test
    void applicationModuleShouldNotDependOnContainerModule() {
        noClasses()
                .that()
                .resideInAPackage("..application..")
                .should()
                .dependOnClassesThat()
                .resideInAPackage("..container..")
                .check(new ClassFileImporter().importPackages(PAYMENT_SERVICE_PACKAGE));
    }
}
