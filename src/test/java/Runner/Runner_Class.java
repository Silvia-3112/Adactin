package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/Feature"},
        glue={"Step_Definition"},
        dryRun=false,
        snippets= CucumberOptions.SnippetType.CAMELCASE,
        tags="@SearchHotel"
)
public class Runner_Class {

}
