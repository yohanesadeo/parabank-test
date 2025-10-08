@Auth
Feature: Register

  @SmokeTest
  Scenario: Memverifikasi pengguna dapat berhasil mendaftar akun baru.
    Given Buka halaman utama.
    When Klik 'Register'.
    And Isi semua field dengan data valid & unik.
    And Klik tombol 'Register'.
    Then Pengguna berhasil terdaftar, melihat pesan selamat datang, dan otomatis login.
