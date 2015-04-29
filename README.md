# SMDP Project, Group 5

# Constraints:
* lowerbound < upperbound DONE
* enums skal være forskellig værdier og samme type DONE
* værdi af default skal ligge i interval/enum DONE
* values skal være Constant evt med Unary minus DONE med stjerne
* gruppenavne skal være unikke/parameter skal være unikke 
* parmrefs skal pege på parametre/ikke grupper DONE
* Måske skal vi også validere på at man refererer en parameter der er optional.... tænker det kan give noget "weirdness" hvis den så anvendes i visse expressions.
* Man kan ikke refererer en optional parameter i constraints, hvis ikke den har en default værdi. REVIEW
* Constraints bør have en description (warning)
* Alle parametre og grupper bør have unikke navne globalt
* Enumerated værdier bør være unikke DONE
* En bounded range bør kun være Integer (eller anden værdi, men vi har kun integer)
* En true,false enumeration bør kun have de to og kun to værdier

# Kodegenerering:
# .Net klient
Filbeskrivelse
* ChurchConfig / Configuration / Configurator.cs - Indeholder den genereret kode
* ChurchConfig / Configuration / CommonConfig.cs - Indeholder baseklasser til koden
* ChurchConfig / ConfigControl.xaml - Er usercontrollen til visning af konfigurationen
* ChurchConfig / HubPage.xaml - Er hovedvinduet i applikationen

Der er ikke lavet validering i UI. 
![Alt text](/Smdp2015DotNetClient/screenshot_04292015_141316.png ".Net Client")


# Tests:
* Metamodel
* Grammatik
* Kodegeneratorer


