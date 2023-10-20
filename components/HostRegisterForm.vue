<template>
    <!-- component -->
<div class="flex bg-gray-100">
<form @submit.prevent="handleSubmit(registerCustomer)">
<div class="m-auto">
  <div>
   <p class="text-center" style="font-size: 1.8rem;">Sign up</p>
     <div class="mt-5 bg-white rounded-lg shadow">
       
        <div class="px-5 pb-5">
           <div class="flex">
              <div class="flex-grow w-2/4 pr-2"><input  placeholder="First name" v-model="formData.firstName" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
              <div class="flex-grow"><input placeholder="Middle name" v-model="formData.lastName" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
              <div class="flex-grow"><input placeholder="Last name" v-model="formData.lastName" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
           </div>
           <div class="flex">
              <div class="flex-grow w-2/4 pr-2"><input type="date" v-model="formData.dateOfBirth" placeholder="Date of birth" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
              <div class="flex-grow">
                    <select id="gender" v-model="formData.gender"
                    class="bg-gray-50 border border-gray-300 text-gray-900 text-sm rounded-lg
                     focus:ring-blue-500 focus:border-blue-500 block w-full p-2.5 dark:bg-gray-700 
                     dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500
                      dark:focus:border-blue-500 text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   
                      transition duration-500 ease-in-out transform border-transparent 
                      rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white 
                      dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current 
                      ring-offset-2 ring-gray-400"
                      
                      >
                    <option selected>Gender</option>
                    <option value="Male">Male</option>
                    <option value="Female">Female</option>
                    <option value="Other">Other</option>
                    </select>
              </div>
           </div>
           <input  placeholder="Nationality" type="text" v-model="formData.nationality" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400">
           
        </div>
       
        <div class="px-5 pb-5">
           <input  placeholder="Email" type="email" v-model="formData.email" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400">
           <input  type="text" v-model="formData.username" placeholder="Username" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"> 
           <input  type="password" v-model="formData.password" placeholder="Password" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"> 
           <input  type="password" v-model="formData.confirmPassword" placeholder="Confirm password" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"> 
        </div>
        <div class="px-5 pb-5">
           <input  placeholder="Social Link 1" type="text" v-model="formData.socialLink1" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400">
           <input  placeholder="socialLink 2" type="text" v-model="formData.socialLink2" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400">
           <input  placeholder="socialLink 3" type="text" v-model="formData.socialLink3" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400">
           <input  type="text" v-model="formData.aboutMe" placeholder="About me" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"> 
           <input  type="file" v-on="formData.portfolioFiles" multiple placeholder="Portfolio images" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"> 
        </div>
        <hr class="mt-4">
        <div class="flex flex-row-reverse p-3">
           <div class="flex-initial pl-3">
              <button type="submit" class="flex items-center px-5 py-2.5 font-medium tracking-wide text-white capitalize   bg-black rounded-md hover:bg-gray-800  focus:outline-none focus:bg-gray-900  transition duration-300 transform active:scale-95 ease-in-out">
                 <span class="pl-2 mx-1">Sign up</span>
              </button>
           </div>
          
          
        </div>
     </div>
    
     </div>
  </div>
</form>
</div>
</template>

<script>
export default{
data(){
  return {
     formData: {
        firstName: "",
        lastName: "",
        contact: "",
        email:"",
        gender:"",
        dateOfBirth: "",
        username: "",
        password: "",
        confirmPassword: "",
        nationality: "",
        position: "",
        website: "",
        website: "",
        socialLink1: "",
        socialLink2: "",
        socialLink3: "",
        aboutMe: "",
        portfolioFiles: [],
     }
  }
},

methods: {
  async registerCustomer(){
     console.log("Hello birches");
     if(this.formData){
        if(this.formData.password == this.formData.confirmPassword){
           console.log(this.formData)
        } else {
           console.log("Passwords do not match");
        }
     }
     else{
        console.log("No form data to process");
     }
  }
}
}


</script>

<style>

</style>

