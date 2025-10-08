@Account
Feature: Open New Account

  Background:
    Given Pengguna sudah login.

  @SmokeTest
  Scenario: Memverifikasi pengguna dapat membuka rekening baru tipe CHECKING.
    When Klik menu 'Open New Account'.
    And Pilih 'CHECKING'.
    And Klik 'Open New Account'.
    Then Sistem menampilkan pesan 'Account Opened!' dan nomor rekening baru.
