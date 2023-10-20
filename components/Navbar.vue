<template>
<nav class="bg-white-800 mt-5">
  <div class="mx-auto max-w-7xl px-2 sm:px-6 plg:px-8">
    <div class="relative flex h-16 items-center justify-between">
      <div class="absolute inset-y-0 left-0 flex items-center sm:hidden">
        <!-- Mobile menu button-->
        <button type="button" class="relative inline-flex items-center justify-center rounded-md p-2 text-gray-400 hover:bg-gray-700 hover:text-white focus:outline-none focus:ring-2 focus:ring-inset focus:ring-white" aria-controls="mobile-menu" aria-expanded="false">
          <span class="absolute -inset-0.5"></span>
          <span class="sr-only">Open main menu</span>
          <!--
            Icon when menu is closed.

            Menu open: "hidden", Menu closed: "block"
          -->
          <svg class="block h-6 w-6" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" aria-hidden="true">
            <path stroke-linecap="round" stroke-linejoin="round" d="M3.75 6.75h16.5M3.75 12h16.5m-16.5 5.25h16.5" />
          </svg>
          <!--
            Icon when menu is open.

            Menu open: "block", Menu closed: "hidden"
          -->
          <svg class="hidden h-6 w-6" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" aria-hidden="true">
            <path stroke-linecap="round" stroke-linejoin="round" d="M6 18L18 6M6 6l12 12" />
          </svg>
        </button>
      </div>
      <div class="flex flex-1 items-center justify-center sm:items-stretch sm:justify-start">
        <div class="flex flex-shrink-0 items-center">
          <a href="#" class="text-gray-900 rounded-md px-3 py-2 text-lg font-medium" aria-current="page"><NuxtLink to="/"> Ticket Sensei </NuxtLink> </a>
        </div>
     
      </div>
      <div>
        <!-- Profile dropdown -->
        <div class="relative ml-3">
          <div>
            <input type="search" placeholder="Search event" class="border-2 border-gray-800 bg-transparent border-solid p-2 pl-8 pr-8 rounded-3xl"/>
          </div>
          
          <!--
            Dropdown menu, show/hide based on menu state.
            
            Entering: "transition ease-out duration-100"
              From: "transform opacity-0 scale-95"
              To: "transform opacity-100 scale-100"
            Leaving: "transition ease-in duration-75"
              From: "transform opacity-100 scale-100"
              To: "transform opacity-0 scale-95"
            -->
          </div>
        </div>
        <div class="absolute inset-y-0 right-0 flex items-center pr-2 sm:static sm:inset-auto sm:ml-6 sm:pr-0">
          
          <div class="flex flex-1 items-center justify-center sm:items-stretch sm:justify-start">
            <div class="flex flex-shrink-0 items-center">
              
              <NuxtLink to="/create_event" class="border-2 border-gray-800 border-solid p-2 rounded-3xl pl-10 pr-10">Create Event</NuxtLink>
          <ul class="flex">
            <li @click="showModal" style="cursor: pointer;" class="text-gray-900 rounded-md px-3 py-2 text-lg font-medium " aria-current="page"> Login  </li>
            <!-- <button @click="showModal" class="btn">Show Modal</button> -->
        <MyModal v-if="isModalVisible" @close="closeModal"  >
                <LoginForm/>
        </MyModal>
            
        <li @click="showRegisterModal" style="cursor: pointer;" class="text-gray-900 rounded-md px-3 py-2 text-lg font-medium" aria-current="page"> Sign up </li>
        <MyModal v-if="isRegisterModalVisible" @close="closeRegisterModal" >
            <RegisterUserForm/>
        </MyModal>
          </ul>
        </div>
     
      </div>
      </div>
    </div>
  </div>

  <!-- Mobile menu, show/hide based on menu state. -->
  <div class="sm:hidden" id="mobile-menu">
    <div class="space-y-1 px-2 pb-3 pt-2">
      <!-- Current: "bg-gray-900 text-white", Default: "text-gray-300 hover:bg-gray-700 hover:text-white" -->
      <!-- <a href="#" class="bg-gray-900 text-white block rounded-md px-3 py-2 text-base font-medium" aria-current="page">Ticket Sensei</a>
      <a href="#" class="bg-gray-900 text-white block rounded-md px-3 py-2 text-base font-medium" aria-current="page">Ticket Sensei</a>
      <a href="#" class="bg-gray-900 text-white block rounded-md px-3 py-2 text-base font-medium" aria-current="page">Ticket Sensei</a>
      <a href="#" class="bg-gray-900 text-white block rounded-md px-3 py-2 text-base font-medium" aria-current="page">Ticket Sensei</a> -->
    </div>
  </div>
</nav>
</template>

<script>
   import MyModal from '~/components/MyModal.vue';

export default {
  
  components: {
    MyModal,
  },
  data() {
    return {
      isModalVisible: false,
      isRegisterModalVisible: false,
    };
  },
  methods: {
    showModal() {
      this.isModalVisible = true;
    },
    closeModal() {
      this.isModalVisible = false;
    },
    showRegisterModal() {
      this.isRegisterModalVisible = true;
    },
    closeRegisterModal() {
      this.isRegisterModalVisible = false;
    },
  }
}

</script>

<style>

</style>