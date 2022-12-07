Feature: URL

  Scenario: TCC.001 Invalid URL
    When TCC.001 User enter invalid URL
    Then TCC.001 User gagal mengakses web danai.id

  Scenario: TCC.002 Valid URL
    When TCC.002 User enter valid URL
    Then TCC.002 User berhasil mengakses web danai.id