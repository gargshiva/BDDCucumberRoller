package steps

import cucumber.api.scala.{EN, ScalaDsl}
import utils.StringUtils

/**
  * Created by sgar42 on 06-Jan-18.
  */
class StepDefinitions extends ScalaDsl with EN{
  var stringUtils:StringUtils = _
  var result:String = _
  Given("""^My StringUtils app should be running$"""){() =>
    stringUtils = new StringUtils
  }

  When("""I pass lowercase String object ([a-z]*)"""){(input:String) =>
    result = stringUtils.convertStringToUpperCase(input)
  }

  When("""I pass uppercase String object ([a-z]*)"""){(input:String) =>
    result = stringUtils.convertStringToUpperCase(input)
  }

  Then("""result should be in uppercase and equal to ([A-Z]*)"""){(expectedResult:String)=>
    assert(result.equals(expectedResult),"Incorrect computation")
  }

  Then("""result should be in lowercase and equal to ([A-Z]*)"""){(expectedResult:String)=>
    assert(result.equals(expectedResult+" "),"Incorrect computation")
  }
}