Feature: Login

  Scenario: TCC.003 User Kosongkan Kode Perusahaan
    When TCC.003 User input data login dan kosongkan kode perusahaan
    And TCC.003 User klik button login
    Then TCC.003 User gagal login, Company code tidak boleh kosong

  Scenario: TCC.004 User Kosongkan Username
    When TCC.004 User input data login dan kosongkan Username
    And TCC.004 User klik button login
    Then TCC.004 User gagal login, Username tidak boleh kosong

  Scenario: TCC.005 User Kosongkan Password
    When TCC.005 User input data login dan kosongkan Password
    And TCC.005 User klik button login
    Then TCC.005 User gagal login, Password tidak boleh kosong


