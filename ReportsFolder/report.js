$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/BDD1-2 Direct to CURA Hospital.feature");
formatter.feature({
  "name": "BDD1-2 Direct to CURA Hospital",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Direct to page CURA Hospital",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User buka browser",
  "keyword": "Given "
});
formatter.match({
  "location": "DirectToCURAHospital.User_buka_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input url website CURA Hospital",
  "keyword": "When "
});
formatter.match({
  "location": "DirectToCURAHospital.User_input_url_website_CURA_Hospital()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User akan ditampilkan halaman CURA Hospital",
  "keyword": "Then "
});
formatter.match({
  "location": "DirectToCURAHospital.User_akan_ditampilkan_halaman_CURA_Hospital()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User akan ditampilkan button make appointment di halaman beranda",
  "keyword": "And "
});
formatter.match({
  "location": "DirectToCURAHospital.User_akan_ditampilkan_button_make_appointment_di_halaman_beranda()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/login.feature");
formatter.feature({
  "name": "Test Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check login is successfull with valid credential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User akses web dan ingin login",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginValidCred.User_akses_web_dan_ingin_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input username dan password yang valid",
  "keyword": "When "
});
formatter.match({
  "location": "LoginValidCred.User_input_username_dan_password_yang_valid()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Klik button login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginValidCred.Klik_button_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User berhasil login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginValidCred.User_berhasil_login()"
});
formatter.result({
  "status": "passed"
});
});