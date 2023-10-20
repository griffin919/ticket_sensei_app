<template>
    <!-- component -->
<div class="flex bg-gray-100">
<form @submit.prevent="createEvent">
<div class="m-auto">
  <div>
   <p class="text-center" style="font-size: 1.8rem;">Create Event</p>
     <div class="mt-5 bg-white rounded-lg shadow">
       
        <div class="px-5 pb-5 grid grid-cols-2 gap-2">
         <div>
            <div >
              <div class="flex-grow  pr-2"><input  placeholder="Event name" v-model="formData.eventName" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
              <div class="flex-grow"><input placeholder="Event description" v-model="formData.eventDescription" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
            </div>
            <div class="flex">
               <div class="flex-grow w-2/4 pr-2"><input type="date" v-model="formData.eventDateTime" placeholder="Event date & time" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
               <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.eventDuration" placeholder="Event duration" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
           </div>
           <div>
               <div class="flex">
                  <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.eventLocation.address" placeholder="Venue address" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
                  <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.eventLocation.city" placeholder="City" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
               </div>
               <div class="flex">
                  <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.eventLocation.region" placeholder="Region" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
                  <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.eventLocation.gmapCode" placeholder="Google maps code" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
               </div>
               <div>
                  <div class="flex-grow pr-2"><input type="text" v-model="formData.eventLocation.description" placeholder="Location description" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
               </div>
            </div>
            <div class="flex">
               <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.review" placeholder="gmapCode" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
            </div>
         </div>
         <div>

            <div>
               <div class="flex">
                  <div class="flex-grow w-2/4 pr-2"><input type="number" v-model="formData.eventLink" placeholder="Event link" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
                  <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.EventUpdate" placeholder="Update" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
               </div>
               <div class="flex">
                  <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.eventStatus" placeholder="Event status" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
                  <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.bookingDeadline" placeholder="Booking deadline" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
               </div  >
               
               <div class="flex-grow w-2/4 pr-2"><input type="number" v-model="formData.ticketQty" placeholder="Maximum ticket Qty" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
               <div class="flex">
                  <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.ticketCategory1.name" placeholder="Name opt 1" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
                  
                  <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.ticketCategory1.rate" placeholder="Rate opt 1" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
               </div>
               <div class="flex">
                  <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.ticketCategory2.name" placeholder="Name opt 2" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
                  <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.ticketCategory2.rate" placeholder="Rate opt 2" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
               </div>
               <div class="flex">

                  <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.ticketCategory3.name" placeholder="Name opt 3" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
                  <div class="flex-grow w-2/4 pr-2"><input type="text" v-model="formData.ticketCategory3.rate" placeholder="Rate opt 3" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
               </div>
               <div class="flex-grow pr-2"><input type="file" multiple v-on="formData.eventImages" placeholder="eventImages" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400"></div>
            </div>
            
            <input  placeholder="eventCategory" type="text" v-model="formData.eventCategory" class=" text-black placeholder-gray-600 w-full px-4 py-2.5 mt-2 text-base   transition duration-500 ease-in-out transform border-transparent rounded-lg bg-gray-200  focus:border-blueGray-500 focus:bg-white dark:focus:bg-gray-800 focus:outline-none focus:shadow-outline focus:ring-2 ring-offset-current ring-offset-2 ring-gray-400">
            
         </div>
       
         
         <hr class="mt-4">
         <div class="flex flex-row-reverse p-3">
           <div class="flex-initial pl-3">
              <button type="submit" class="flex items-center px-5 py-2.5 font-medium tracking-wide text-white capitalize   bg-black rounded-md hover:bg-gray-800  focus:outline-none focus:bg-gray-900  transition duration-300 transform active:scale-95 ease-in-out">
                 <span class="pl-2 mx-1">Create Event</span>
               </button>
           </div>
          
           
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
        eventName: "",
        eventDescription: "",
        eventDateTime: "",
        eventDuration:"",
        eventCategory:"",
        eventLocation: [{
            address: "",
            city:"",
            region:"",
            description:"",
            gmapCode:"",
        }],
        eventReview: [{
            rating:"",
            review:"",
        }],
        eventLink: "",
        EventUpdate: "",
        eventStatus:"",
        eventHostID: "",
        bookingDeadline: "",
        ticketQty: "",
        ticketCategory1:[{rate: "", name: ""}],
        ticketCategory2:[{rate: "", name: ""}],
        ticketCategory3:[{rate: "", name: ""}],
        ticketID: "",
        eventImages:[]
     }
  }
},

methods: {
  async createEvent(){
     console.log("Hello birches");
     if(this.formData){
        if(this.formData.password == this.formData.confirmPassword){
           try{
               const response = $fetch("http://localhost:8080/api/event/",{
                  headers: {
                     "Content-Type": "multipart/form-data",
                  },
                  method: "POST",
                  body: this.formData
               })
           } catch(error) {
               console.error('Contact form could not be send', error)
           }
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

