[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    [#include "_common/head.ftlh"]
</head>
<body>
<div class="detail">
    <form class="novavizitka" method="post" action="/nova">
        <div class="jmeno">
            <label for="jmeno" class="form-label">Jméno:</label>
            <input id="jmeno" name="jmeno" class="form-control" type="text" value=""/>
        </div>

        <div class="firma">
            <label for="firma" class="form-label">Firma:</label>
            <input id="firma" name="firma" class="form-control" type="text" value=""/>
        </div>

        <div class="udaje">
            <div class="adresa">
                <label for="ulice" class="form-label">Ulice:</label>
                <input id="ulice" name="ulice" class="form-control" type="text" value=""/>

                <span><label for="obecPsc" class="form-label">PSČ a obec:</label>
                <input id="obecPsc" name="obecPsc" class="form-control" type="text" value=""/></span>
            </div>

            <div class="kontakty">
                <label for="email" class="form-label">Email:</label>
                <input id="email" name="email" class="form-control" type="text" value=""/>

                <label for="telefon" class="form-label">Telefon:</label>
                <input id="telefon" name="telefon" class="form-control" type="text" value=""/>

                <label for="web" class="form-label">Web:</label>
                <input id="web" name="web" class="form-control" type="text" value=""/>
            </div>
        </div>

        <button class="button" type="submit">Přidat</button>

    </form>
</div>
</body>
</html>
